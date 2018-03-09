package br.com.nutellatux.remedyWeb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.nutellatux.remedyWeb.modelo.Pessoa;

@Stateless
public class PessoaDao { // TODO Como usar o Datasource no TomCat se ele é só um containner????
	// C3PO para aplicações que não tem DS.

	@PersistenceContext
	private EntityManager manager;

	public void adiciona(Pessoa pessoa) {
		this.manager.persist(pessoa);
	}

	public Pessoa busca(Integer id) {
		return this.manager.find(Pessoa.class, id);
	}

	public List<Pessoa> lista() {
		return this.manager.createQuery("Select p From Pessoa p").getResultList();
	}

	public void remove(Pessoa pessoa) {
		Pessoa pessoaParaRemover = busca(pessoa.getId());
		this.manager.remove(pessoaParaRemover);
	}

	public void altera(Pessoa pessoa) {
		this.manager.merge(pessoa);

	}

}
