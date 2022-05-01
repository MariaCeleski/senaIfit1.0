package com.senaiIFit.senaIfit.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
public class Instrutor extends Pessoa {
	
	@Column
	@Enumerated
	private ModalidadeAtividade modalidadeAtividade;
	@Column
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

	
	@Override
	public String toString() {
		return "Instrutor [modalidadeAtividade=" + modalidadeAtividade + ", registroProfissional="
				+ registroProfissional + ", EnderecoPorApelido=" + ", cliente="  + "]";
	}

	 
	

}
