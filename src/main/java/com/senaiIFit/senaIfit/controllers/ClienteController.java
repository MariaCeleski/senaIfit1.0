package com.senaiIFit.senaIfit.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senaiIFit.senaIfit.entidades.Cliente;
@RestController
public class ClienteController {
	
	@PostMapping("/Cliente")
	public void salvaCliente(@RequestBody Cliente cliente) {
		
		System.out.println(cliente.getEndereco()); 
		
		
	}

}
