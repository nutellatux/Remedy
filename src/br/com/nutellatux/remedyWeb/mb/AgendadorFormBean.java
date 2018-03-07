package br.com.nutellatux.remedyWeb.mb;

import javax.inject.Inject;

import br.com.nutellatux.remedyWeb.servicos.Agendador;

public class AgendadorFormBean {

	private String expressaoMinutos;
	private String expressaoSegundos;

	@Inject
	private Agendador agendador;

	public void agendar() {

	}

	public String getExpressaoMinutos() {
		return expressaoMinutos;
	}

	public void setExpressaoMinutos(String expressaoMinutos) {
		this.expressaoMinutos = expressaoMinutos;
	}

	public String getExpressaoSegundos() {
		return expressaoSegundos;
	}

	public void setExpressaoSegundos(String expressaoSegundos) {
		this.expressaoSegundos = expressaoSegundos;
	}

}
