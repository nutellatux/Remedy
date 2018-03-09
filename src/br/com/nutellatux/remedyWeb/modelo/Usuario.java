package br.com.nutellatux.remedyWeb.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.com.nutellatux.remedyWeb.tipo.Ativo;
import br.com.nutellatux.remedyWeb.tipo.Perfil;
import br.com.nutellatux.remedyWeb.tipo.UsuarioTipo;

@Entity
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String userName;

	@Enumerated(EnumType.STRING)
	private Perfil perfil;
	
	@Enumerated(EnumType.STRING)
	private UsuarioTipo usuarioTipo;
	
	@Enumerated(EnumType.STRING)
	private Ativo ativo;

	@OneToOne
	@JoinColumn(unique=true)
	private DadosProfissionais dadosProfissionais;
	
	// tem que ser List, pois pode ter varios grupos de acesso
//	@ManyToMany
//	private GrupoAcesso grupoAcesso;
	
	@OneToOne
	@JoinColumn(unique=true)
	private Pessoa pessoa;
	
	
	
	
	
	
	
	
	
	//Getters Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public UsuarioTipo getUsuarioTipo() {
		return usuarioTipo;
	}

	public void setUsuarioTipo(UsuarioTipo usuarioTipo) {
		this.usuarioTipo = usuarioTipo;
	}

	public Ativo getAtivo() {
		return ativo;
	}

	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}

	public DadosProfissionais getDadosProfissionais() {
		return dadosProfissionais;
	}

	public void setDadosProfissionais(DadosProfissionais dadosProfissionais) {
		this.dadosProfissionais = dadosProfissionais;
	}

//	public GrupoAcesso getGrupoAcesso() {
//		return grupoAcesso;
//	}
//
//	public void setGrupoAcesso(GrupoAcesso grupoAcesso) {
//		this.grupoAcesso = grupoAcesso;
//	}


}
