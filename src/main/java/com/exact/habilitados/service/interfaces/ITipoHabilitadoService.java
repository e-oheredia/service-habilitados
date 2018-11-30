package com.exact.habilitados.service.interfaces;


import com.exact.habilitados.entity.TipoHabilitado;

public interface ITipoHabilitadoService {
	
	public Iterable<TipoHabilitado> listarHabilitados(Long PaqueteId);	

}
