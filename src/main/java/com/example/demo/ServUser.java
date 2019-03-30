package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servUser")
public class ServUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long solicitudid;
	private String fecha;
	private String estado;
	private String nombre;
	
	
	public ServUser() {
	
	}


	public ServUser(long solicitudid, String fecha, String estado, String nombre) {
		
		this.solicitudid = solicitudid;
		this.fecha = fecha;
		this.estado = estado;
		this.nombre = nombre;
	}


	public long getSolicitudid() {
		return solicitudid;
	}


	public void setSolicitudid(long solicitudid) {
		this.solicitudid = solicitudid;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
