package com.senaiIFit.senaIfit.entidades;

import java.time.LocalDate;

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
	private String nome;
	@Column
	private String cnpj;
	@Column
	private LocalDate dataHora;
	@Column
	private Endereco endereco;
	@Column
	@Enumerated
	private CategoriaParceiro categoria;
		
	public Parceiro() {
		this.dataHora = LocalDate.now();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDate dataHora) {
		this.dataHora = dataHora;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public CategoriaParceiro getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaParceiro categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Parceiro [nome=" + nome + ", cnpj=" + cnpj + ", dataHora=" + dataHora + ", endereco=" + endereco
				+ ", categoria=" + categoria + "]";
	}	
		
		
}
