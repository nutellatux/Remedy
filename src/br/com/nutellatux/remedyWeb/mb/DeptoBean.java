package br.com.nutellatux.remedyWeb.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.nutellatux.remedyWeb.dao.DeptoDao;
import br.com.nutellatux.remedyWeb.modelo.Depto;

@Named
@ViewScoped
public class DeptoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private DeptoDao deptoDao;

	private Depto depto = new Depto();
	private List<Depto> deptos; // Tem que ser Private?????

	 
	
	public void grava() {
		if (this.depto.getId() == 0) {
			this.deptoDao.adiciona(depto);
		}else {
			this.deptoDao.altera(depto);
		}
		
		this.deptos = deptoDao.lista();

		limpaFormularioDoJSF();
	}
	
	

	public void remove () {
		this.deptoDao.remove(this.depto);
		
		this.deptos = deptoDao.lista();
		
		limpaFormularioDoJSF();
	}
	
	
	
	public void limpaFormularioDoJSF() {
		this.depto = new Depto();
	}
	
	
	
	
	// Getters e Setters

	public Depto getDepto() {
		return depto;
	}

	public void setDepto(Depto depto) {
		this.depto = depto;
	}

	public List<Depto> getDeptos() {
		if (this.deptos == null) {
			this.deptos = deptoDao.lista();
		}
		return deptos;
	}
}
