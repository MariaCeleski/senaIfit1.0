package com.senaiIFit.senaIfit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TesteController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String teste() {
		return "Oi!Eu sou a primeira!";
	}
	
	/*@GetMapping(value="/test")
	public String teste2(@pathVariable("")) {
		return "Abbreviate!";*/

}*/
}
