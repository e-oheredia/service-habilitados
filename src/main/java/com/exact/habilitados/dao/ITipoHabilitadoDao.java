package com.exact.habilitados.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.habilitados.entity.TipoHabilitado;


@Repository
public interface ITipoHabilitadoDao extends CrudRepository<TipoHabilitado, Long>{

	
	@Query("FROM TipoHabilitado th WHERE th IN (SELECT pt.tipohabilitado "
			+ "FROM PaqueteTipoHabilitado pt WHERE pt.paquete.id = ?1) ")
	public Iterable<TipoHabilitado> listarHabilitados(Long PaqueteId);
}
