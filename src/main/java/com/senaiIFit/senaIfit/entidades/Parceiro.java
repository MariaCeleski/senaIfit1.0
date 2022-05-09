package com.senaiIFit.senaIfit.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parceiro {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String cnpj;
	@Column
	private String nome;
	@Column
	@Enumerated
	private CategoriaParceiro categoria;
	
	public CategoriaParceiro getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaParceiro categoria) {
		this.categoria = categoria;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Parceiro [cnpj=" + cnpj + ", nome=" + nome + ", categoria=" + categoria + "]";
	}
	
	
}

