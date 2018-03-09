package br.com.nutellatux.remedyWeb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.nutellatux.remedyWeb.modelo.DadosProfissionais;
import br.com.nutellatux.remedyWeb.modelo.Depto;

@Stateless
public class DadosProfissionaisDao {  //TODO Como usar o Datasource no TomCat se ele é só um containner????
									  // C3PO para aplicações que não tem DS.
	
	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona (DadosProfissionais profissionais) {
		this.manager.persist(profissionais);
	}
	
	public DadosProfissionais busca (Integer id) {
		return this.manager.find(DadosProfissionais.class, id);
	}
	
	public List<DadosProfissionais> lista(){
		return this.manager.createQuery("Select d From DadosProfissionais d").getResultList();
	}
	
	public void remove (DadosProfissionais profissionais) {
		DadosProfissionais profissionaisParaRemover = busca(profissionais.getId());
		this.manager.remove(profissionaisParaRemover);
	}

	public void altera(DadosProfissionais profissionais) {
		this.manager.merge(profissionais);
		
	} 
	
}
