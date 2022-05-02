package com.senaiIFit.senaIfit.entidades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Checkin {
	
	private Cliente cliente;
	private Parceiro parceiros;
	private LocalDateTime dataNascimento;
	private LocalDate dataAtual;
	
	
	private Instrutor instrutor;
	private ModalidadeAtividade atividade;
	
	public Checkin() {
	this.dataNascimento = LocalDateTime.now();
	this.dataAtual = LocalDate.now();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	
	Date dataNascimento = sdf.parse(sc.next());{
	
	
	cal.setTime(dataNascimento);
	cal.add(Calendar.MONTH, 0);
	
	/*data actual descobrir data de nascimento*/
	int year = cal.get(Calendar.YEAR);
	dataNascimento = cal.getTime();
	
	Date atualData = new Date();
	cal.setTime(atualData);
	
	int atualYear = cal.get(Calendar.YEAR);
	int age = (atualYear - year);
	}
	
	
	}	
	
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(LocalDate dataAtual) {
		this.dataAtual = dataAtual;
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
		return dataNascimento;
	}
	
	
	public Instrutor getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	

}
