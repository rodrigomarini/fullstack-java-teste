package br.com.lemontech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.lemontech.util.DateUtil;

@Entity
@Table(name="viagem")
public class Viagem implements Serializable{

	private static final long serialVersionUID = 592642092008099108L;
	
	public Viagem(){
		
	}
	
	@Id
	@Column(name = "id_solicitacao", nullable=false, length=200)
	private Integer idSolicitacao;
	
	@Column(name = "nome_passageiro", nullable=true, length=200)
	private String nomePassageiro;
	
	@Column(name = "cia_aerea", nullable=true, length=200)
	private String ciaAerea;
	
	@Column(name = "saida", nullable=true)
	private Date saida;
	
	@Column(name = "chegada", nullable=true)
	private Date chegada;
	
	@Column(name = "cidade_origem", nullable=true, length=200)
	private String cidadeOrigem;
	
	@Column(name = "cidade_destino", nullable=true, length=200)
	private String cidadeDestino;
	
	@Column(name = "status_consulta_ws", nullable=true, length=15)
	private String statusConsultaWS;
	
	public Viagem(String statusConsultaWS){
		this.statusConsultaWS = statusConsultaWS;
	}

	private Viagem(Viagem viagemBuilder){
		this.idSolicitacao = viagemBuilder.idSolicitacao;
		this.nomePassageiro = viagemBuilder.nomePassageiro;
		this.ciaAerea = viagemBuilder.ciaAerea;
		this.saida = viagemBuilder.saida;
		this.chegada = viagemBuilder.chegada;
		this.cidadeOrigem = viagemBuilder.cidadeOrigem;
		this.cidadeDestino = viagemBuilder.cidadeDestino;
		this.statusConsultaWS = viagemBuilder.statusConsultaWS;
	}
	
	public String getStatusConsultaWS(){
		return statusConsultaWS;
	}
	
	public Integer getIdSolicitacao() {
		return idSolicitacao;
	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public String getCiaAerea() {
		return ciaAerea;
	}

	public Date getSaida() {
		return saida;
	}

	public Date getChegada() {
		return chegada;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public Viagem idSolicitacao(Integer idSolicitacao){
		this.idSolicitacao = idSolicitacao;
		return this;
	}

	public Viagem nomePassageiro(String nomePassageiro){
		this.nomePassageiro = nomePassageiro;
		return this;
	}

	public Viagem ciaAerea(String ciaAerea){
		this.ciaAerea = ciaAerea;
		return this;
	}

	public Viagem saida(XMLGregorianCalendar saida){
		this.saida = DateUtil.getDate(saida);
		return this;
	}

	public Viagem chegada(XMLGregorianCalendar chegada){
		this.chegada = DateUtil.getDate(chegada);
		return this;
	}

	public Viagem cidadeOrigem(String cidadeOrigem){
		if(cidadeOrigem == null){
			cidadeOrigem = "";
		}
		this.cidadeOrigem = cidadeOrigem;
		return this;
	}

	public Viagem cidadeDestino(String cidadeDestino){
		this.cidadeDestino = cidadeDestino;
		return this;
	}

	public Viagem build() {
		return new Viagem(this);
	}

}