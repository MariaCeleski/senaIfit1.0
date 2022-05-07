package com.senaiIFit.senaIfit.checkinPrinc;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.senaiIFit.senaIfit.entidades.ModalidadeAtividade;



public class CriaCheckin {
	
	@Entity
	public class CriaClienteCh {

		@NotBlank
		@Email
		private String email;
		@NotEmpty
		private String endereco;
		@NotBlank
		protected String nome;
		@NotEmpty
		@Size(min = 6, max = 6)
		protected String registroProfissional;
		@NotEmpty
		@Size(min = 11, max = 11)
		protected String cpf;
		@NotBlank
		protected String sexo;
		@NotBlank
		protected String peso;
		@NotBlank 
		protected String altura;
		public ModalidadeAtividade getAtividade() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}

	
}
