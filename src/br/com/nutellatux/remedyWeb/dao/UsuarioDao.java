package br.com.nutellatux.remedyWeb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.nutellatux.remedyWeb.modelo.Usuario;

@Stateless
public class UsuarioDao { // TODO Como usar o Datasource no TomCat se ele é só um containner????
	// C3PO para aplicações que não tem DS.

	@PersistenceContext
	private EntityManager manager;

	public void adiciona(Usuario usuario) {
		this.manager.persist(usuario);
	}

	public Usuario busca(Integer id) {
		return this.manager.find(Usuario.class, id);
	}

	public List<Usuario> lista() {
		return this.manager.createQuery("Select u From Usuario u").getResultList();
	}

	public void remove(Usuario usuario) {
		Usuario usuarioParaRemover = busca(usuario.getId());
		this.manager.remove(usuarioParaRemover);
	}

	public void altera(Usuario usuario) {
		this.manager.merge(usuario);

	}

}
