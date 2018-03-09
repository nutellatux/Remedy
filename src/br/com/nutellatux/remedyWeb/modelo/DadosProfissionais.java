package br.com.nutellatux.remedyWeb.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.nutellatux.remedyWeb.tipo.Ativo;

@Entity
public class DadosProfissionais implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String empresa;
	private String projeto;
	private String cargo;
	private String superiorDireto;
	private String superiorCliente;
	
	@Enumerated(EnumType.STRING)
	private Ativo ativo;
	
	@OneToOne
	private Usuario usuario;
	
	
	
	
	//Getters Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSuperiorDireto() {
		return superiorDireto;
	}
	public void setSuperiorDireto(String superiorDireto) {
		this.superiorDireto = superiorDireto;
	}
	public String getSuperiorCliente() {
		return superiorCliente;
	}
	public void setSuperiorCliente(String superiorCliente) {
		this.superiorCliente = superiorCliente;
	}
	public Ativo getAtivo() {
		return ativo;
	}
	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}
	
	

}
