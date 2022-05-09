package com.senaiIFit.senaIfit.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaiIFit.senaIfit.entidades.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Optional<Cliente> findById(Long id);
	public Optional<Cliente> findByIdEmailAndCpf(String param1, 
			String param2);
}