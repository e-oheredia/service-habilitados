package com.exact.habilitados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exact.habilitados.entity.TipoHabilitado;
import com.exact.habilitados.service.interfaces.ITipoHabilitadoService;


@RestController
@RequestMapping("/tipohabilitados")
public class TipoHabilitadoController {
	
	@Autowired
	ITipoHabilitadoService tipoHabilitadoService;
	
	@GetMapping("{paqueteId}")
	public ResponseEntity<Iterable<TipoHabilitado>> listarTipoHabilitados(@PathVariable Long paqueteId) {
		return new ResponseEntity<Iterable<TipoHabilitado>>(tipoHabilitadoService.listarHabilitados(paqueteId), HttpStatus.OK);
	}

}
