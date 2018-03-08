package br.com.nutellatux.remedyWeb.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Depto {//Agora vai

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String descricao;
 
	@OneToMany(mappedBy = "depto")
	private List<SubDepto> subDeptos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<SubDepto> getSubDeptos() {
		return subDeptos;
	}

	public void setSubDeptos(List<SubDepto> subDeptos) {
		this.subDeptos = subDeptos;
	}

	

}
