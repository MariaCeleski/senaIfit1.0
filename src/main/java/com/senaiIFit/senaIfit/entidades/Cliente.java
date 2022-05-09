package com.senaiIFit.senaIfit.entidades;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Entity
public class Cliente extends Pessoa {
	@OneToOne
	public Long clienteId;
	@Email
	@NotBlank
	public String email;
	@NotEmpty
	public Endereco endereco;
	
	public Cliente() {
		super(TipoPessoa.CLIENTE);
		
	}
	
	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
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
