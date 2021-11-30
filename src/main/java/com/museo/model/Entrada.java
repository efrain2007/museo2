/**
 * 
 */
package com.museo.model;

import java.io.Serializable;

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
@Table(name = "entrada")
public class Entrada implements Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrada")
    private int idEntrada;
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Column(name = "descripcion_entrada")
    private String descripcionEntrada;
    @Column(name = "precio_entrada")
    private double precioEntrada;
    @Column(name = "fecha_programada")
    private String fechaProgramada;
    @ManyToOne
    private Horario horario;
    // @Column(name="cantidad_entrada")
    // private int cantidadEntrada;
    // @Column(name="id_tipo_entrada")
    // private int idTipoEntrada;

    public Entrada() {
        super();
    }

    public Entrada(int idEntrada, String nombreCliente, String descripcionEntrada, double precioEntrada,
            String fechaProgramada) {
        super();
        this.idEntrada = idEntrada;
        this.nombreCliente = nombreCliente;
        this.descripcionEntrada = descripcionEntrada;
        this.precioEntrada = precioEntrada;
        this.fechaProgramada = fechaProgramada;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDescripcionEntrada() {
        return descripcionEntrada;
    }

    public void setDescripcionEntrada(String descripcionEntrada) {
        this.descripcionEntrada = descripcionEntrada;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(String fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    } 

}
