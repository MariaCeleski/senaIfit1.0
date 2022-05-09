package com.senaiIFit.senaIfit.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaiIFit.senaIfit.entidades.Checkin;
import com.senaiIFit.senaIfit.services.CheckinService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class CheckinController {

	private CheckinService checkinService;
	
		
	@PostMapping("/checkin/")
	public ResponseEntity<Checkin> cadastraCheckin(@Valid @RequestBody Checkin checkin) {
		this.checkinService.cadastraCheckin();
		return new ResponseEntity<>(checkin, HttpStatus.CREATED);
	}
	
	@GetMapping("/checkin/{id}")
	public ResponseEntity<Checkin> obtemCheckin(@PathVariable String id) {
		Optional<Checkin> checkin = this.checkinService.obtemCheckin(Long.parseLong(id));
		return ResponseEntity.of(checkin);
	}
	
}

