/**
 * 
 */
package com.museo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author BUENO
 *
 */
@Entity
@Table(name = "tikect")
public class Tikect implements Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tikect")
    private int idTikect;
    @Column(name = "fecha_emision")
    private Date fechaEmision;
    @Column(name = "subtotal")
    private double subtotal;
    @Column(name = "total")
    private double total;

    @ManyToOne
    private Entrada entrada;
    @ManyToOne
    private Trabajador trabajador;

    public Tikect() {
    }

    public Tikect(int idTikect, Date fechaEmision, double subtotal, double total, Entrada entrada,
            Trabajador trabajador) {
        this.idTikect = idTikect;
        this.fechaEmision = fechaEmision;
        this.subtotal = subtotal;
        this.total = total;
        this.entrada = entrada;
        this.trabajador = trabajador;
    }

    public int getIdTikect() {
        return idTikect;
    }

    public void setIdTikect(int idTikect) {
        this.idTikect = idTikect;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

}
