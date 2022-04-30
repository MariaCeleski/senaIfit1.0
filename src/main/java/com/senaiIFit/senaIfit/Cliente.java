package com.senaiIFit.senaIfit;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;

public class Cliente extends Pessoa {

	private String email;
	private Map<String, Endereco> enderecoPorApelido;
	
	public Cliente() {
		super(TipoPessoa.CLIENTE);
		this.enderecoPorApelido = new HashMap<String, Endereco>();
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Map<String, Endereco> getEnderecoPorApelido() {
		return enderecoPorApelido;
	}

	public void setEnderecoPorApelido(Map<String, Endereco> enderecoPorApelido) {
		this.enderecoPorApelido = enderecoPorApelido;		
		
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", enderecoPorApelido=" + enderecoPorApelido + "]";
	}
	
	
}