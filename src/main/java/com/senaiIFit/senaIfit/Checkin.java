package com.senaiIFit.senaIfit;

import java.time.LocalDateTime;

public class Checkin {
	
	private Cliente cliente;
	private Parceiros parceiros;
	private LocalDateTime dataHora;
	private String apelidoEndereco;
	private Instrutor instrutor;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Parceiros getParceiros() {
		return parceiros;
	}
	public void setParceiros(Parceiros parceiros) {
		this.parceiros = parceiros;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
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
