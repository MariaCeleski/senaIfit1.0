package com.senaiIFit.senaIfit.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity()
public class Cliente extends Pessoa {

	@Column
	private String email;

	@Column
	private Endereco endereco;

	public Cliente() {
		super(TipoPessoa.CLIENTE);
		
			}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", endereco=" + endereco + "]";
	}

}