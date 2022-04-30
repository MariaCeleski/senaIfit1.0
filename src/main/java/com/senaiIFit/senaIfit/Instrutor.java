package com.senaiIFit.senaIfit;

import java.util.Map;
import java.util.HashMap;

public class Instrutor extends Pessoa {
	
	private ModalidadeAtividade modalidadeAtividade;
	protected String registroProfissional;
	private Map<String, Endereco>EnderecoPorApelido;
	
	public Instrutor() {
		super(TipoPessoa.INSTRUTOR);
		this.EnderecoPorApelido = new HashMap<String, Endereco>();
	}

	public ModalidadeAtividade getModalidadeAtividade() {
		return modalidadeAtividade;
	}

	public void setModalidadeAtividade(ModalidadeAtividade modalidadeAtividade) {
		this.modalidadeAtividade = modalidadeAtividade;
	}

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	public Map<String, Endereco> getEnderecoPorApelido() {
		return EnderecoPorApelido;
	}

	public void setEnderecoPorApelido(Map<String, Endereco> enderecoPorApelido) {
		EnderecoPorApelido = enderecoPorApelido;
	}

	@Override
	public String toString() {
		return "Instrutor [modalidadeAtividade=" + modalidadeAtividade + ", registroProfissional="
				+ registroProfissional + ", EnderecoPorApelido=" + EnderecoPorApelido + "]";
	}
		
	

}
