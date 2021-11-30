/**
 * 
 */
package com.museo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author BUENO
 *
 */
@Entity
@Table(name = "estado")
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estado")
	private int idEstado;
	@Column(name = "denominacion")
	private String denominacion;
	@Column(name = "descripcion")
	private String descripcion;

	public Estado() {
	}

	public Estado(int idEstado, String denominacion, String descripcion) {
		this.idEstado = idEstado;
		this.denominacion = denominacion;
		this.descripcion = descripcion;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
