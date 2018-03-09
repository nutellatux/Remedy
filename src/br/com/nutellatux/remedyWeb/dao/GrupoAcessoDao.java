package br.com.nutellatux.remedyWeb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.nutellatux.remedyWeb.modelo.GrupoAcesso;

@Stateless
public class GrupoAcessoDao { // TODO Como usar o Datasource no TomCat se ele é só um containner????
	// C3PO para aplicações que não tem DS.

	@PersistenceContext
	private EntityManager manager;

	public void adiciona(GrupoAcesso acesso) {
		this.manager.persist(acesso);
	}

	public GrupoAcesso busca(Integer id) {
		return this.manager.find(GrupoAcesso.class, id);
	}

	public List<GrupoAcesso> lista() {
		return this.manager.createQuery("Select g From GrupoAcesso g").getResultList();
	}

	public void remove(GrupoAcesso acesso) {
		GrupoAcesso acessoParaRemover = busca(acesso.getId());
		this.manager.remove(acessoParaRemover);
	}

	public void altera(GrupoAcesso acesso) {
		this.manager.merge(acesso);

	}

}
