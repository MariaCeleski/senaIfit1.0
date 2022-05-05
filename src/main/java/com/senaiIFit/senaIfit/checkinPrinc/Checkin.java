package com.senaiIFit.senaIfit.checkinPrinc;

import java.time.LocalDate;
import java.time.LocalTime;

import com.senaiIFit.senaIfit.entidades.Cliente;
import com.senaiIFit.senaIfit.entidades.Instrutor;
import com.senaiIFit.senaIfit.entidades.ModalidadeAtividade;
import com.senaiIFit.senaIfit.entidades.Parceiro;


public class Checkin {

	private Cliente cliente;
	private Instrutor instrutor;
	private Parceiro parceiro;
	private LocalTime tempo;
	private LocalDate data;
	private String sugestao;
	private ModalidadeAtividade atividade;
	
	
	Checkin() {
		this.data = LocalDate.now();
		this.tempo = LocalTime.now();
		this.atividade =  ModalidadeAtividade.BEATCHTENNIS;
	}
	
	
	
	public String getObservação() {
		return sugestao;
	}
	public void setObservação(String observação) {
		this.sugestao = observação;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Instrutor getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	public Parceiro getParceiro() {
		return parceiro;
	}
	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}
	public LocalTime getTempo() {
		return tempo;
	}
	public void setTempo(LocalTime tempo) {
		this.tempo = tempo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public ModalidadeAtividade getAtividade() {
		return atividade;
	}
	public void setAtividade(ModalidadeAtividade atividade) {
		this.atividade = atividade;
	}
	

		}