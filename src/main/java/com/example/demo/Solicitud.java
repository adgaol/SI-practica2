package com.example.demo;

import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "solicitud")
public class Solicitud {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int solicitudid;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private	Usuario cliente;
	@ManyToOne
    @JoinColumn(name = "servicio_id")
	private Servicio servicio;
	private String fecha;
	private String direccion;
	private Double importe;
	private String estado;
	private String descripcion;
	
	public Solicitud() {
		
	}
	public Solicitud(Usuario cliente, Servicio servicio, String fecha, String direccion, Double importe, String estado,
			String descripcion) {
		
		this.cliente = cliente;
		this.servicio = servicio;
		this.fecha = fecha;
		this.direccion = direccion;
		this.importe = importe;
		this.estado = estado;
		this.descripcion = descripcion;
	}
	 // Muchos usuarios hacia una solicitud.
    // La columna de la tabla con la clave ajena hacia usuario es "user_id"
   
	public Usuario getCliente() {
		return this.cliente;
	}
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	// Muchos servicios hacia una solicitud.
    // La columna de la tabla con la clave ajena hacia servicio es "servicio_id"
	
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
