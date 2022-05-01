package com.senaiIFit.senaIfit.entidades;

import java.time.LocalDateTime;

public class Checkin {
	
	private Cliente cliente;
	private Parceiro parceiros;
	private LocalDateTime dataHora;
	private String apelidoEndereco;
	private Instrutor instrutor;
	private ModalidadeAtividade atividade;
	
	public Checkin() {
	this.dataHora = LocalDateTime.now();
	}	
	
	public ModalidadeAtividade getAtividade() {
		return atividade;
	}
	public void setAtividade(ModalidadeAtividade atividade) {
		this.atividade = atividade;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Parceiro getParceiros() {
		return parceiros;
	}
	public void setParceiros(Parceiro parceiros) {
		this.parceiros = parceiros;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	
	public String getApelidoEndereco() {
		return apelidoEndereco;
	}
	public void setApelidoEndereco(String apelidoEndereco) {
		this.apelidoEndereco = apelidoEndereco;
	}
	public Instrutor getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	

}
