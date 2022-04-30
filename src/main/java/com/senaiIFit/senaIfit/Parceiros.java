package com.senaiIFit.senaIfit;

import java.util.Date;
import java.util.Map;

public class Parceiros {
	
	private String nome;
	private String cnpj;
	private Date dataEntrada;
	private Map<String, Endereco> enderecoPorApelido;
	private CategoriaParceiros categoria;
	private ModalidadeAtividade atividade;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public CategoriaParceiros getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaParceiros categoria) {
		this.categoria = categoria;
	}
	public ModalidadeAtividade getAtividade() {
		return atividade;
	}
	public void setAtividade(ModalidadeAtividade atividade) {
		this.atividade = atividade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Map<String, Endereco> getEnderecoPorApelido() {
		return enderecoPorApelido;
	}
	public void setEnderecoPorApelido(Map<String, Endereco> enderecoPorApelido) {
		this.enderecoPorApelido = enderecoPorApelido;
	}
	
	@Override
	public String toString() {
		return "Parceiros [nome=" + nome + ", cnpj=" + cnpj + ", dataEntrada=" + dataEntrada + ", enderecoPorApelido="
				+ enderecoPorApelido + ", categoria=" + categoria + ", atividade=" + atividade + "]";
	}
	
}
