package com.senaiIFit.senaIfit.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaiIFit.senaIfit.entidades.Checkin;
import com.senaiIFit.senaIfit.entidades.Cliente;
import com.senaiIFit.senaIfit.repositorios.CheckinRepository;
import com.senaiIFit.senaIfit.repositorios.ClienteRepository;

@Service
public class CheckinService {

	@Autowired
	private ClienteRepository clienteRepo;
	
	@Autowired
	private CheckinRepository checkinRepo;

	public String cadastraCheckin() {
		Optional<Cliente> cliente = clienteRepo.findById(null);
		if (cliente.isPresent()) {
			Checkin checkin = new Checkin();
			checkin.setCliente(cliente.get());
			checkin.setParceiro(checkin.getParceiro());
			checkin.setInstrutor(checkin.getInstrutor());
			checkin.setData(checkin.getData());
			
			checkinRepo.save(checkin);
			
		}	
		return "Checkin Inválido";
					
	}
		
	public List<Checkin> listaCheckinEntreDatas(LocalDate data1,
			LocalDate data2) {
		Optional<List<Checkin>> checkins = checkinRepo.findByDataBetween(data1, data2);
		if (checkins.isPresent()) {
			return checkins.get();
		} else {
			return null;
		}
	}
	
	public Optional<Checkin> obtemCheckin(long checkinId) {
		return this.checkinRepo.findById(checkinId);
	}
	
}

		