package com.senaiIFit.senaIfit;

public abstract class Pessoa {

	protected String nome;
	protected String cpf;
	protected String dataNascimento;
	protected String altura;
	protected String peso;
	protected String registroProfissional;
	private TipoPessoa tipo;
	
	public TipoPessoa getTipo() {
		return tipo;
	}
	public Pessoa(TipoPessoa tipo) {
		this.tipo = tipo;
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getRegistroProfissional() {
		return registroProfissional;
	}
	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", altura=" + altura
				+ ", peso=" + peso + ", registroProfissional=" + registroProfissional + ", tipo=" + tipo + "]";
	}
	
}
