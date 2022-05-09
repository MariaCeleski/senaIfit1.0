package com.senaiIFit.senaIfit.repositorios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaiIFit.senaIfit.entidades.Checkin;
import com.senaiIFit.senaIfit.entidades.Cliente;

@Repository
public interface CheckinRepository extends JpaRepository<Checkin, Long> {

	public Optional<Checkin> findById(Long id);
	public Optional<Cliente> findByEmailAndCpf(String param1, 
			String param2);
	public Optional<List<Checkin>> findByDataBetween(LocalDate data1, LocalDate data2);
	public Optional<Checkin> findByTempoBetween(LocalTime tempo1, LocalTime tempo2);
	
}
