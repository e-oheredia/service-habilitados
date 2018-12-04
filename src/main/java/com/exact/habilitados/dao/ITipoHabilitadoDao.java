package com.exact.habilitados.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.exact.habilitados.entity.TipoHabilitado;


@Repository
public interface ITipoHabilitadoDao extends CrudRepository<TipoHabilitado, Long>{

	
	
}
