package com.exact.habilitados.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="paquete")
public class Paquete implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paquete_id")
	private Long id;
	
	private String descripcion;
	
	
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "paquete_tipo_habilitado",
	        joinColumns = @JoinColumn(name = "paquete_id"),
	        inverseJoinColumns = @JoinColumn(name = "tipo_habilitado_id"))
	private Set<TipoHabilitado> tipoHabilitado;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<TipoHabilitado> getTipoHabilitado() {
		return tipoHabilitado;
	}

	public void setTipoHabilitado(Set<TipoHabilitado> tipoHabilitado) {
		this.tipoHabilitado = tipoHabilitado;
	}

	

}
