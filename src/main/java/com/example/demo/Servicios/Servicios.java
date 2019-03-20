package com.example.demo.Servicios;
import java.util.LinkedList;

import com.example.demo.*;


public class Servicios {
	private String nombre;
	private String categoria;
	private LinkedList<Usuario> profesional;
	private String ubicacion;
	private LinkedList<Hora> horasOcupadas;
	private int precio;
	private String descripcion;
	
	public Servicios(String nombre, String categoria, String ubicacion, int precio) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.ubicacion = ubicacion;
		this.horasOcupadas = new LinkedList<>();
		this.profesional = new LinkedList<>();
		this.precio = precio;
		this.descripcion = "";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public LinkedList<Usuario> getProfesional() {
		return profesional;
	}
	public void setProfesional(LinkedList<Usuario> profesional) {
		this.profesional = profesional;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public LinkedList<Hora> getHorasOcupadas() {
		return horasOcupadas;
	}
	public void setHorasOcupadas(LinkedList<Hora> horasOcupadas) {
		this.horasOcupadas = horasOcupadas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
