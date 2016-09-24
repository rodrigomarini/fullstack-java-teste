package br.com.lemontech.ws.validator;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;
import br.com.lemontech.ws.validator.strategy.InvalidResponse;
import br.com.lemontech.ws.validator.strategy.ResponseObject;
import br.com.lemontech.ws.validator.strategy.ValidResponse;

public class ResponseValidator{
	
	public static ResponseObject validIntegrity(Solicitacao solicitacao){
		
		if(solicitacao == null){
			return new InvalidResponse(StatusConsultaWS.ERRO_SOLICITACAO); 
		}
		
		Aereos aereos = solicitacao.getAereos();
		
		if(aereos == null || aereos.getAereo().isEmpty()){
			return new InvalidResponse(StatusConsultaWS.ERRO_AEREOS);
		}

		Aereo aereo = solicitacao.getAereos().getAereo().get(0);
		
		if(aereo == null){
			return new InvalidResponse(StatusConsultaWS.ERRO_AEREO);
		}
		
		AereoSeguimento aereoSeguimento = aereo.getAereoSeguimento().get(0);
		
		if(aereoSeguimento == null){
			return new InvalidResponse(StatusConsultaWS.ERRO_AEREO_SEGUIMENTO);
		}
		
		return new ValidResponse(solicitacao, aereo, aereoSeguimento);
	}
	

}