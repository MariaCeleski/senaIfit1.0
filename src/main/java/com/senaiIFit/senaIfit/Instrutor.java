package com.senaiIFit.senaIfit;

public class Instrutor extends Pessoa {
	
	private ModalidadeAtividade modalidadeAtividade;
	protected String registroProfissional;
	
	public Instrutor() {
		super(TipoPessoa.INSTRUTOR);
			
		
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

}
