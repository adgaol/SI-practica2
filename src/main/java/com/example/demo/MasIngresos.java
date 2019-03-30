package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "masDemandados")
public class MasIngresos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long servicioid;
	private String nombreserv;
	private String nombre;
	private Integer ingresos;
	
	public MasIngresos() {
	
	}

	public MasIngresos(long servicioid, String nombreserv, String nombre, Integer count) {
		this.servicioid = servicioid;
		this.nombreserv = nombreserv;
		this.nombre = nombre;
		this.ingresos = count;
	}

	public String getNombreserv() {
		return nombreserv;
	}

	public void setNombreserv(String nombreserv) {
		this.nombreserv = nombreserv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIngresos() {
		return ingresos;
	}

	public void setIngresos(Integer ingresos) {
		this.ingresos = ingresos;
	}
	
	
}
