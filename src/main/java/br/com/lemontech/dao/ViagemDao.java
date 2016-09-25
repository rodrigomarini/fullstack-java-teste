package br.com.lemontech.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.lemontech.model.Viagem;

public class ViagemDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public ViagemDao(){
		
	}
	
	public ViagemDao(EntityManager manager){
		super();
		this.manager = manager;
	}
	
	public void save(Viagem viagem) {
		manager.merge(viagem);
	}

}
