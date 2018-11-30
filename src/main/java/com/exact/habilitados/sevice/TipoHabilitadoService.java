package com.exact.habilitados.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.habilitados.dao.ITipoHabilitadoDao;
import com.exact.habilitados.entity.TipoHabilitado;
import com.exact.habilitados.service.interfaces.ITipoHabilitadoService;

@Service
public class TipoHabilitadoService implements ITipoHabilitadoService{

	@Autowired
	ITipoHabilitadoDao tipohabilitadodao;
	
	@Override
	public Iterable<TipoHabilitado> listarHabilitados(Long PaqueteId) {
		return tipohabilitadodao.listarHabilitados(PaqueteId);
	}

}
