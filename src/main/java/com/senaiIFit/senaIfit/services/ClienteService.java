package com.senaiIFit.senaIfit.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaiIFit.senaIfit.entidades.Cliente;
import com.senaiIFit.senaIfit.repositorios.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepo;

	
	public void cadastraCliente(Cliente cliente) {
		cliente.setCpf(cliente.getCpf());
		cliente.setNome(cliente.getNome());
		cliente.setEmail(cliente.getEmail());
		cliente.setEndereco(cliente.getEndereco());
		cliente.setNascimento(cliente.getNascimento());
		cliente.setPeso(cliente.getPeso());
		cliente.setAltura(cliente.getAltura());	
	
		this.clienteRepo.save(cliente);
	}
	

	public Optional<Cliente> obtemCliente(long clienteId) {
		return this.clienteRepo.findById(clienteId);
	}
}
