package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesionalesDemandados")
public class ProfesionalesDemandados {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userid;
	private String nombre;
	private Integer count;
	
	public ProfesionalesDemandados() {
	
	}

	public ProfesionalesDemandados(long userid, String nombre, Integer count) {
		this.userid= userid;
		
		this.nombre = nombre;
		this.count = count;
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
