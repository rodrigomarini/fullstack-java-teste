package br.com.lemontech.ws.validator;

public enum StatusConsultaWS {
	
	SUCESS("Completo"),
	ERRO_SOLICITACAO("Solicitação Vazia"),
	ERRO_AEREO("Aéreo Vazio"),
	ERRO_AEREOS("Aéreos Vazio"),
	ERRO_AEREO_SEGUIMENTO("Aéreo Seguimento Vazio");
	
	private String status;

	StatusConsultaWS(String status){
		this.status = status;
	}
	
	public String toString(){
		return this.status;
	}

}
