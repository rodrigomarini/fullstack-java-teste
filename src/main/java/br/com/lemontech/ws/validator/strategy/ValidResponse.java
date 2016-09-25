package br.com.lemontech.ws.validator.strategy;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.ws.validator.StatusConsultaWS;

/**
 * Classe que contém o retorno do ws lemontech com objetos considerados válidos 
 * 
 * @author Rodrigo Marini
 */
public class ValidResponse implements ResponseObject{

	private Solicitacao solicitacao;
	private Aereo aereo;
	private AereoSeguimento aereoSeguimento;
	private StatusConsultaWS statusConsulta = StatusConsultaWS.SUCESS;

	/** 
	 * Construtor que recebe os objetos necessários para a impl do app
     */
	public ValidResponse(Solicitacao solicitacao, Aereo aereo, AereoSeguimento aereoSeguimento){
		this.solicitacao = solicitacao;
		this.aereo = aereo;
		this.aereoSeguimento = aereoSeguimento;
	};

	public Solicitacao getSolicitacao() {
		return this.solicitacao;
	}

	public Aereo getAereo() {
		return this.aereo;
	}

	public AereoSeguimento getAereoSeguimento() {
		return this.aereoSeguimento;
	}

	public String getStatusConsulta() {
		return this.statusConsulta.toString();
	}

}
