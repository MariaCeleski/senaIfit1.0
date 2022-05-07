package com.senaiIFit.senaIfit.checkinPrinc;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.senaiIFit.senaIfit.entidades.ModalidadeAtividade;

@Entity
public class CriaClienteCh {
	
	private Long clienteId;
	private String instrutor;
	private String parceiro;
	private LocalTime tempo;
	private LocalDate data;
	private String sugestaoCheckin;
	private ModalidadeAtividade atividade;

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public String getParceiro() {
		return parceiro;
	}

	public void setParceiro(String parceiro) {
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

	public String getSugestao() {
		return sugestaoCheckin;
	}

	public void setSugestao(String sugestao) {
		this.sugestaoCheckin = sugestao;
	}

	public ModalidadeAtividade getAtividade() {
		return atividade;
	}

	public void setAtividade(ModalidadeAtividade atividade) {
		this.atividade = atividade;
	}
}