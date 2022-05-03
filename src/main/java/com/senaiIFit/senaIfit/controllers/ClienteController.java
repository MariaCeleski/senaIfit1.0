package com.senaiIFit.senaIfit.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.senaiIFit.senaIfit.entidades.Cliente;
import com.senaiIFit.senaIfit.services.CheckinService;
import com.senaiIFit.senaIfit.services.ClienteService;

public class ClienteController {
	@Autowired
	private ClienteService clienteService;

	@Autowired
	private CheckinService checkinService;
	
	@GetMapping("/cliente/")
	public ResponseEntity<String> testeCliente() {
		if (false) {
			return new ResponseEntity<>("Requisicao invalida!", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("Entidade foi criada com sucesso!", HttpStatus.CREATED);
	}

	@PostMapping("/cliente/")
	public ResponseEntity salvaCliente(@Valid @RequestBody Cliente cliente) {
		this.clienteService.cadastraCliente(cliente);
		return new ResponseEntity<>(cliente, HttpStatus.CREATED);
	}

	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> obtemCliente(@PathVariable String id) {
		Optional<Cliente> cliente = this.clienteService.obtemCliente(Long.parseLong(id));
		return ResponseEntity.of(cliente);
	}

}
