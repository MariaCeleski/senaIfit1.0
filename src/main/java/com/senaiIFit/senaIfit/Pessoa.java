package com.senaiIFit.senaIfit;

public abstract class Pessoa {

	protected String nome;
	protected String cpf;
	protected String dataNascimento;
	protected String altura;
	protected String peso;
	
	private SexoPessoa genero;
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
