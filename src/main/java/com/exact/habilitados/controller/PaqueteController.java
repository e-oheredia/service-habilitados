package com.exact.habilitados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exact.habilitados.entity.Paquete;
import com.exact.habilitados.service.interfaces.IPaqueteService;


@RestController
@RequestMapping("/paquetes")
public class PaqueteController {
	
	@Autowired
	IPaqueteService paqueteservice;
	
	@GetMapping
	public ResponseEntity<Iterable<Paquete>> listarAll() {
		return new ResponseEntity<Iterable<Paquete>>(paqueteservice.findAll(), HttpStatus.OK);
	}
	

}
