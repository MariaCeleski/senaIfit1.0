package com.senaiIFit.senaIfit;

public class Instrutor extends Pessoa {
	
	private ModalidadeAtividade modalidadeAtividade;
	

	public Instrutor() {
		super(TipoPessoa.INSTRUTOR);
			
		
	}


	public ModalidadeAtividade getModalidadeAtividade() {
		return modalidadeAtividade;
	}


	public void setModalidadeAtividade(ModalidadeAtividade modalidadeAtividade) {
		this.modalidadeAtividade = modalidadeAtividade;
	}

}
