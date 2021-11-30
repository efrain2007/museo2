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
@Table(name = "cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo")
    private int idCargo;
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "descripcion")
    private String descripcion;

    public Cargo() {
        super();
    }

    public Cargo(int idCargo, String denominacion, String descripcion) {
        super();
        this.idCargo = idCargo;
        this.denominacion = denominacion;
        this.descripcion = descripcion;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
