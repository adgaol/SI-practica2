package com.example.demo.Cliente;
import java.util.LinkedList;
import com.example.demo.Servicios.*;

public class Cliente {
	public String nombre;
	public String correo;
	public String password;
	public LinkedList<Servicios> historicoDeServicios;
	public Cliente(String nombre, String correo, String password) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.historicoDeServicios = new LinkedList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LinkedList<Servicios> getHistoricoDeServicios() {
		return historicoDeServicios;
	}
	public void setHistoricoDeServicios(LinkedList<Servicios> historicoDeServicios) {
		this.historicoDeServicios = historicoDeServicios;
	}
	

}
