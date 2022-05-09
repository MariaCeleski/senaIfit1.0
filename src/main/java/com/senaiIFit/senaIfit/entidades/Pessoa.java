package com.senaiIFit.senaIfit.entidades;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@MappedSuperclass
public abstract class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank
	public String nome;
	@NotEmpty
	@Size(min = 11, max = 11)
	public String cpf;
	@NotBlank
	public LocalDate nascimento;
	@NotBlank
	public int idade;
	@Column
	public Double peso;
	@Column
	public Double altura;
	@Column
	@Enumerated
	private TipoPessoa tipo;
	@Column
	@Enumerated
	private SexoPessoa genero;
	
	public Pessoa (SexoPessoa genero) {
		this.genero = genero;
	}
	public Pessoa (TipoPessoa tipo) {
		this.tipo = tipo;
	}
	
	public Pessoa(LocalDate nascimento) {
		this.nascimento = nascimento;
		
		calcularIdade();		
	}
	private void calcularIdade() {
		this.idade = Period.between(this.nascimento, LocalDate.now()).getYears();
		
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
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public TipoPessoa getTipo() {
		return tipo;
	}
	public SexoPessoa getGenero() {
		return genero;
	}
	public void setGenero(SexoPessoa genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", peso=" + peso
				+ ", altura=" + altura + ", tipo=" + tipo + ", genero=" + genero + "]";
	}

}
