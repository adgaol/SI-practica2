package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "noDemandados")
public class NoDemandados {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long servicioid;
 private String nombreserv;
 private String nombre;
 
public NoDemandados() {
	
}
public NoDemandados(String nombreserv,String nombre) {
	
	//this.nombreserv = nombreserv;
	this.nombreserv=nombreserv;
	
	this.nombre = nombre;
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

/*public String getNombreUser() {
	return nombreuser;
}
public void setNombreUser(String nombreUser) {
	this.nombreuser = nombreUser;
}*/
 
}
