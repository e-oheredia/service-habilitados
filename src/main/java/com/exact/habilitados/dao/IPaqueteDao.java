package com.exact.habilitados.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.habilitados.entity.Paquete;


@Repository
public interface IPaqueteDao extends CrudRepository<Paquete, Long>{

	
	
	
}
