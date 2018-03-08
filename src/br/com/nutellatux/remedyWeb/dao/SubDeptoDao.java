package br.com.nutellatux.remedyWeb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.nutellatux.remedyWeb.modelo.SubDepto;

@Stateless
public class SubDeptoDao {  //TODO Como usar o Datasource no TomCat se ele é só um containner????
						// C3PO para aplicações que não tem DS.
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona (SubDepto subDepto) {
		this.manager.persist(subDepto);
	}
	
	public SubDepto busca (Integer id) {
		return this.manager.find(SubDepto.class, id);
	}
	
	public List<SubDepto> lista(){
		return this.manager.createQuery("Select sd From SubDepto sd").getResultList();
	}
	
	public void remove (SubDepto subDepto) {
		SubDepto subDeptoParaRemover = busca(subDepto.getId());
		this.manager.remove(subDeptoParaRemover);
	}

	public void altera(SubDepto subDepto) {
		this.manager.merge(subDepto);
		
	} 
	
}
