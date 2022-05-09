package com.senaiIFit.senaIfit.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
public class Instrutor extends Pessoa {

	@Column
	protected String nregistroprof;
	@Column
	@Enumerated
	private ModalidadeAtividade atividade;

	public Instrutor() {
		super(TipoPessoa.INSTRUTOR);
		
	}
	public String getNregistroprof() {
		return nregistroprof;
	}

	public void setNregistroprof(String nregistroprof) {
		this.nregistroprof = nregistroprof;
	}
	
	public ModalidadeAtividade getAtividade() {
		return atividade;
	}
	public void setAtividade(ModalidadeAtividade atividade) {
		this.atividade = atividade;
	}
	@Override
	public String toString() {
		return "Instrutor [nregistroprof=" + nregistroprof + ", atividade=" + atividade + "]";
	}
	
	
}
