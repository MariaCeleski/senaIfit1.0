package com.senaiIFit.senaIfit.entidades;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity()
public class Cliente extends Pessoa {
	
	
	@Column
	
	private Map<String, Endereco> enderecoPorApelido;
	private Instrutor instrutor;
	
		
	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	
	
	public Cliente() {
		super(TipoPessoa.CLIENTE);
		this.enderecoPorApelido = new HashMap<String, Endereco>();
	}

	public Map<String, Endereco> getEnderecoPorApelido() {
		return enderecoPorApelido;
	}

	public void setEnderecoPorApelido(Map<String, Endereco> enderecoPorApelido) {
		this.enderecoPorApelido = enderecoPorApelido;
	}

	@Override
	public String toString() {
		return "Cliente [enderecoPorApelido=" + enderecoPorApelido + ", instrutor=" + instrutor + "]";
	}

	 	
	
}