package com.senaiIFit.senaIfit.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaiIFit.senaIfit.checkinPrinc.Checkin;


@Repository
public interface CheckinRepository extends JpaRepository<Checkin, Long>{

	public Optional<Checkin> findById(Long id);
	public Optional<Checkin> findByEmailAndCpf(String param1, 
			String param2);
}
