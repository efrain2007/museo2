/**
 * 
 */
package com.museo.model;

import java.sql.Time;

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
@Table(name = "horario")
public class Horario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_horario")
	private int idHorario;

	@Column(name = "hora_inicio")
	private Time horaInicio;

	@Column(name = "hora_fin")
	private Time horaFin;

	public Horario() {
		super();
	}

	public Horario(int idHorario, Time horaInicio, Time horaFin) {
		super();
		this.idHorario = idHorario;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public int getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Time getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}

}
