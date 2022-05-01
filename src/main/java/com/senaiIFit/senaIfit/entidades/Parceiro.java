package com.senaiIFit.senaIfit.entidades;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

public class Parceiro {
	
	private String nome;
	private String cnpj;
	private LocalDateTime dataHora;
	private Map<String, Endereco> enderecoPorApelido;
	private CategoriaParceiro categoria;
		
	public Parceiro() {
		this.dataHora = LocalDateTime.now();
	}	
		
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public CategoriaParceiro getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaParceiro categoria) {
		this.categoria = categoria;
	}
	
	public String getNome() {
		return nome;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
		
	public Map<String, Endereco> getEnderecoPorApelido() {
		return enderecoPorApelido;
	}
	public void setEnderecoPorApelido(Map<String, Endereco> enderecoPorApelido) {
		this.enderecoPorApelido = enderecoPorApelido;
	}

	@Override
	public String toString() {
		return "Parceiro [nome=" + nome + ", cnpj=" + cnpj + ", dataHora=" + dataHora + ", enderecoPorApelido="
				+ enderecoPorApelido + ", categoria=" + categoria + "]";
	}
		
	
	
}
