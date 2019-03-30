package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "masDemandados")
public class MasDemandados {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long servicioid;
	private String nombreserv;
	private String nombre;
	private Integer count;
	
	public MasDemandados() {
	
	}

	public MasDemandados(long servicioid, String nombreserv, String nombre, Integer count) {
		this.servicioid = servicioid;
		this.nombreserv = nombreserv;
		this.nombre = nombre;
		this.count = count;
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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
}
