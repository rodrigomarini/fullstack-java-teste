package br.com.lemontech.ws.validator.strategy;

import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;

/**
 * Abstração para objetos com valores de retorno do WS Lemontech 
 * 
 * @author Rodrigo Marini
 */
public interface ResponseObject {
	
	/** 
	 * Retorna o status da consulta ao WS Lemontech
     *  @return String status 
     */
	public String getStatusConsulta();
	
	/** 
	 * Retorna objeto Aereo do WS Lemontech
     *  @return Aereo aereo 
     */
	public Aereo getAereo();
	
	/** 
	 * Retorna objeto AereoSeguimento do WS Lemontech
     *  @return AereoSeguimento aereoSeguimento 
     */
	public AereoSeguimento getAereoSeguimento();

}
