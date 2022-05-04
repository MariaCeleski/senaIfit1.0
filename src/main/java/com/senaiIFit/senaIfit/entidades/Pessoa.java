package com.senaiIFit.senaIfit.entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	protected String nome;
	@Column
	protected String cpf;
	@Column
	protected LocalDate dataNascimento;
	@Column
	protected Double altura;
	@Column
	protected Double peso;
	@Column
	@Enumerated
	private SexoPessoa genero;
	@Column
	@Enumerated
	private TipoPessoa tipo;
	
	public Pessoa(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	
	public Pessoa(SexoPessoa genero) {
		this.genero = genero;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public SexoPessoa getGenero() {
		return genero;
	}

	public void setGenero(SexoPessoa genero) {
		this.genero = genero;
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", altura=" + altura
				+ ", peso=" + peso + ", genero=" + genero + ", tipo=" + tipo + "]";
	}

	
		
}
