package com.example.demo;

import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userid;
	private String nombre;
	private String apellidos;	
	private String correo;
	private String password;
	private String perfil;
	private String fechadenacimiento;
	private String ciudad;
	
	/*private LinkedList<Servicio> servicios;
	private LinkedList<String> localidades;*/
	
	/*public Usuario(String user, String password) {
		
		this.correo = user;
		this.password = password;
		this.servicios = new LinkedList<>();
		this.localidades = new LinkedList<>();
	}*/
	public Usuario() {
		
	}
	public Usuario(String nombre, String apellidos, String correo, String password, String perfil,
			String fechaDeNacimiento,String ciudad) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.password = password;
		this.perfil = perfil;
		this.fechadenacimiento = fechaDeNacimiento;
		this.ciudad=ciudad;
	}
	
	/*public String getUser() {
		return correo;
	}
	
	public void setUser(String user) {
		this.correo = user;
	}*/
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getFechaDeNacimiento() {
		return fechadenacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechadenacimiento = fechaDeNacimiento;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	/*public LinkedList<Servicio> getServicios() {
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
	}*/
	

}
