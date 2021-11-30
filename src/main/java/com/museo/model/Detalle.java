// /**
//  * 
//  */
// package com.museo.model;
// import java.io.Serializable;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// /**
//  * @author BUENO
//  *
//  */
// @Entity
// @Table(name="detalle")
// public class Detalle implements Serializable {

//     /**
//      * 
//      */
//     private static final long serialVersionUID = 1L;
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     @Column(name="id_detalle")
//     private int idDetalle;
//     @Column(name="id_articulo")
//     private int idArticulo;
//     @Column(name="cantidad")
//     private int cantidad;
//     @Column(name="precio")
//     private double precio;
//     @Column(name="total")
//     private double total;
    
//     public Detalle() {
//         super();
//     }
//     public Detalle(int idDetalle, int idMuseo, int idArticulo, int cantidad, double precio, double total) {
//         super();
//         this.idDetalle = idDetalle;
//         this.idMuseo = idMuseo;
//         this.idArticulo = idArticulo;
//         this.cantidad = cantidad;
//         this.precio = precio;
//         this.total = total;
//     }
//     public int getIdDetalle() {
//         return idDetalle;
//     }
//     public void setIdDetalle(int idDetalle) {
//         this.idDetalle = idDetalle;
//     }
//     public int getIdMuseo() {
//         return idMuseo;
//     }
//     public void setIdMuseo(int idMuseo) {
//         this.idMuseo = idMuseo;
//     }
//     public int getIdArticulo() {
//         return idArticulo;
//     }
//     public void setIdArticulo(int idArticulo) {
//         this.idArticulo = idArticulo;
//     }
//     public int getCantidad() {
//         return cantidad;
//     }
//     public void setCantidad(int cantidad) {
//         this.cantidad = cantidad;   

// }
