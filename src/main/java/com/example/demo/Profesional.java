package com.example.demo;

import java.util.LinkedList;

public class Profesional {
	private String user;
	private String password;
	private LinkedList<Servicio> servicios;
	private LinkedList<String> localidades;
	
	public Profesional(String user, String password) {
		
		this.user = user;
		this.password = password;
		this.servicios = new LinkedList<>();
		this.localidades = new LinkedList<>();
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LinkedList<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(LinkedList<Servicio> servicios) {
		this.servicios = servicios;
	}
	public LinkedList<String> getLocalidades() {
		return localidades;
	}
	public void setLocalidades(LinkedList<String> localidades) {
		this.localidades = localidades;
	}
	

}
