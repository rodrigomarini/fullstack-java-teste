package br.com.lemontech.ws.validator.strategy;

import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.ws.validator.StatusConsultaWS;
import br.com.lemontech.ws.validator.strategy.ResponseObject;

/**
 * Implementação da classe que contem objetos inválidos do retorno ws lemontech 
 * 
 * @author Rodrigo Marini
 */
public class InvalidResponse implements ResponseObject{

	private String statusConsulta;
	
	/** 
	 * Construtor que recebe o status do retorno consultado para mapear o problema do registro
	 * @param StatusConsultaWS statusConsulta que identifica o objeto que veio nulo ou com valores inesperados
     */
	public InvalidResponse(StatusConsultaWS statusConsulta){
		this.statusConsulta = statusConsulta.toString();
	}
	
	public String getStatusConsulta() {
		return statusConsulta;
	}

	public Aereo getAereo() {
		return new Aereo();
	}

	public AereoSeguimento getAereoSeguimento() {
		return new AereoSeguimento();
	}

}
