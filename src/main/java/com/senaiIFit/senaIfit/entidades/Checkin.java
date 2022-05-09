package com.senaiIFit.senaIfit.entidades;

import java.time.LocalDate;
import java.time.LocalTime;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity (name = "Checkins")
public class Checkin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Cliente cliente;
	@OneToOne
	private Parceiro parceiro;
	@Column
	@OneToOne
	private Instrutor instrutor;
	@Column
	private LocalDate data;
	@Column
	private LocalTime tempo;
	@Column
	@Enumerated
	private ModalidadeAtividade atividade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getTempo() {
		return tempo;
	}

	public void setTempo(LocalTime tempo) {
		this.tempo = tempo;
	}

	public ModalidadeAtividade getAtividade() {
		return atividade;
	}

	public void setAtividade(ModalidadeAtividade atividade) {
		this.atividade = atividade;
	}

}

	
		
	



		

		