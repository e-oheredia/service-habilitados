package com.exact.habilitados.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.habilitados.dao.IPaqueteDao;
import com.exact.habilitados.entity.Paquete;
import com.exact.habilitados.service.interfaces.IPaqueteService;

@Service
public class PaqueteService implements IPaqueteService{

	@Autowired
	IPaqueteDao paquetedao;
	
	@Override
	public Iterable<Paquete> findAll() {
		return paquetedao.findAll();
	}

}
