package br.com.nutellatux.remedyWeb.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.nutellatux.remedyWeb.dao.SubDeptoDao;
import br.com.nutellatux.remedyWeb.modelo.SubDepto;

@Named
@ViewScoped
public class SubDeptoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private SubDeptoDao subDeptoDao;

	private SubDepto subDepto = new SubDepto();
	private List<SubDepto> subDeptos; // Tem que ser Private?????

	
	
	public void grava() {
		Integer nulo = null;
		if (this.subDepto.getId() == nulo) {
			this.subDeptoDao.adiciona(subDepto);
		}else {
			this.subDeptoDao.altera(subDepto);
		}
		
		this.subDeptos = subDeptoDao.lista();

		limpaFormularioDoJSF();
	}
	
	

	public void remove () {
		this.subDeptoDao.remove(this.subDepto);
		
		this.subDeptos = subDeptoDao.lista();
		
		limpaFormularioDoJSF();
	}
	
	
	
	public void limpaFormularioDoJSF() {
		this.subDepto = new SubDepto();
	}

	// Getters e Setters

	public SubDepto getSubDepto() {
		return subDepto;
	}



	public void setSubDepto(SubDepto subDepto) {
		this.subDepto = subDepto;
	}



	public List<SubDepto> getSubDeptos() {
		return subDeptos;
	}
	

}
