package br.com.lemontech.managedbeans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.lemontech.model.Viagem;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingService;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import br.com.lemontech.service.ViagemSender;
import br.com.lemontech.util.DateUtil;
import br.com.lemontech.ws.validator.strategy.ResponseObject;
import br.com.lemontech.ws.validator.ResponseValidator;

@Model
public class ConsultaBean {

	private static final String KEY_CLIENT = "base_teste_qa";
	private static final String USER_NAME = "d0804903bf4eeefddf55c63fc600ed5c";
	private static final String USER_PASSWORD = "5c11ca0bf738c2dbb460479530b26db0";

	@Inject
	private WsSelfBookingService service;
	
	@Inject
	private ViagemSender viagemSender;
	
	private List<Viagem> viagens = new ArrayList<Viagem>();
	
	private Integer row = 1;

	/**
	 * Método responsável por consumir o serviço de consulta de viagens nos ultimos 3 meses.
	 */
	@PostConstruct
	private void getViagensWs(){

		Date today = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(today);
		c.add(Calendar.MONTH, -3);

		PesquisarSolicitacaoRequest pesquisarSolicitacao = new PesquisarSolicitacaoRequest();
		pesquisarSolicitacao.setDataInicial(DateUtil.getXMLGregorianCalendar(c.getTimeInMillis()));
		pesquisarSolicitacao.setDataFinal(DateUtil.getXMLGregorianCalendar(today.getTime()));
		pesquisarSolicitacao.setRegistroInicial(row);
		pesquisarSolicitacao.setQuantidadeRegistros(20);		
		pesquisarSolicitacao.setExibirRemarks(true);

		WsSelfBooking port = service.getWsSelfBookingPort();
		PesquisarSolicitacaoResponse response = port.pesquisarSolicitacao(KEY_CLIENT, USER_NAME, USER_PASSWORD, pesquisarSolicitacao);
		processViagem(response);
	}

	/**
	 * Método responsável por consolidar as informações de retorno do WS garantindo a integridades dos dados
	 * e encaminhar os objetos processados para módulos e componentes conseguintes.
	 * 
	 * @param response Retorno do WS consumido
	 */
	private void processViagem(PesquisarSolicitacaoResponse response) {

		for(Solicitacao solicitacao: response.getSolicitacao()){

			ResponseObject responseIntegrity = ResponseValidator.validIntegrity(solicitacao);

			Aereo aereo = responseIntegrity.getAereo();
			AereoSeguimento aereoSeguimento = responseIntegrity.getAereoSeguimento();
			String statusConsulta = responseIntegrity.getStatusConsulta();

			Viagem viagem = new Viagem(statusConsulta)
					.idSolicitacao(solicitacao.getIdSolicitacao())
					.nomePassageiro(solicitacao.getSolicitante().getNome())
					.ciaAerea(aereo.getSource())
					.saida(aereoSeguimento.getDataSaida())
					.chegada(aereoSeguimento.getDataChegada())
					.cidadeOrigem(aereoSeguimento.getCidadeOrigem())
					.cidadeDestino(aereoSeguimento.getCidadeDestino())
					.build();
			
			viagemSender.send(viagem);
			viagens.add(viagem);
		}
	}

	public List<Viagem> getViagens() {
		return viagens;
	}

	public void pagePrevious() {
		if(row>1){
			row--;
		}
	}

	public void pageNext() {
		row++;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

}
