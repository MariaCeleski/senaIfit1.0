package com.senaiIFit.senaIfit.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaiIFit.senaIfit.entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	public Optional<Cliente> findById(Long id);
	public Optional<Cliente> findByEmailAndCpf(String param1, 
			String param2);
}
