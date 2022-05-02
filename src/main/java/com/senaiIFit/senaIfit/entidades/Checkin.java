package com.senaiIFit.senaIfit.entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class Checkin {

	private Cliente cliente;
	private Parceiro parceiro;
	private LocalTime horaEntrada;
	private LocalTime horaSaida;
	private LocalDate dataNascimento;
	private LocalDate dataAtual;
	private Instrutor instrutor;
	private ModalidadeAtividade atividade;

	public Checkin() {
		this.dataAtual = LocalDate.now();
		this.horaSaida = LocalTime.now();
		this.horaEntrada = LocalTime.from(horaEntrada);
		this.horaEntrada.format(null);
		
	}	
		 
		
		//calcular idade
		/*LocalDate dataNascimento = LocalDate.of(dataNascimento);
		LocalDate hoje = LocalDate.now();
		Period.between(dataNascimento, hoje);*/
	


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

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(LocalDate dataAtual) {
		this.dataAtual = dataAtual;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public ModalidadeAtividade getAtividade() {
		return atividade;
	}

	public void setAtividade(ModalidadeAtividade atividade) {
		this.atividade = atividade;
	}