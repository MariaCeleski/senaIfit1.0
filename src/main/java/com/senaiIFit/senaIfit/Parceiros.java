package com.senaiIFit.senaIfit;

import java.util.Date;
import java.util.Map;

public class Parceiros {
	
	private String cnpj;
	private String nome;
	private Date dataEntrada;
	private Map<String, Endereco> enderecoPorApelido;
	
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
	

}
