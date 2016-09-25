package br.com.lemontech.ws.validator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;
import br.com.lemontech.ws.validator.strategy.InvalidResponse;
import br.com.lemontech.ws.validator.strategy.ResponseObject;
import br.com.lemontech.ws.validator.strategy.ValidResponse;

public class ResponseValidatorTest {

	private Solicitacao validSolicitacao;
	private Solicitacao invalidSolicitacao;
	
	private Aereos aereos;
	private Aereo aereo;
	private AereoSeguimento aereoSeguimento;
	
	@Before
	public void setup(){
		
		validSolicitacao = new Solicitacao();
		
		aereos = new Aereos();
		aereo = new Aereo();
		aereoSeguimento = new AereoSeguimento();
		
		aereo.getAereoSeguimento().add(aereoSeguimento);
		aereos.getAereo().add(aereo);
		validSolicitacao.setAereos(aereos);
		
	}
	
	@Test
	public void whenTheWsReturnHasNullObjects(){
		ResponseObject response = ResponseValidator.validIntegrity(invalidSolicitacao);
		assertSame(response.getClass(), InvalidResponse.class);
	}

	@Test
	public void whenTheWsReturnHasntNullObjects(){	
		ResponseObject response = ResponseValidator.validIntegrity(validSolicitacao);
		assertSame(response.getClass(), ValidResponse.class);
		assertEquals(response.getStatusConsulta(), StatusConsultaWS.SUCESS.toString());
	}

}
