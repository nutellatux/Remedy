package br.com.nutellatux.remedyWeb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.nutellatux.remedyWeb.modelo.Depto;

@Stateless
public class DeptoDao {  //TODO Como usar o Datasource no TomCat se ele é só um containner????
						// C3PO para aplicações que não tem DS.
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona (Depto depto) {
		this.manager.persist(depto);
	}
	
	public Depto busca (Integer id) {
		return this.manager.find(Depto.class, id);
	}
	
	public List<Depto> lista(){
		return this.manager.createQuery("Select d From Depto d").getResultList();
	}
	
	public void remove (Depto depto) {
		Depto deptoParaRemover = busca(depto.getId());
		this.manager.remove(deptoParaRemover);
	}

	public void altera(Depto depto) {
		this.manager.merge(depto);
		
	} 
	
}
