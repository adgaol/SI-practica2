package com.example.demo;

import java.util.LinkedList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.Servicios.Hora;
@Entity
@Table(name = "servicio")
public class Servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long servicioid;
	private String nombreserv;
	private String descripcion;
	private String categoria;
	private int duracion;
	private Double precio;
	@ManyToOne
    @JoinColumn(name = "userid")
	private Usuario profesional;
		/*private String fecha;
		private String hora;
		private String lugar;
		private String estado;
		private LinkedList<Hora> horasOcupadas;*/
	public Servicio() {
	}

	/*public Servicio(String nombre, String descripcion, String categoria, int duracion, int precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.duracion = duracion;
		this.precio = precio;
		this.estado = "pendiente";
	}*/
	
	
	

	public Servicio(String nombre, String descripcion, String categoria, int duracion, Double precio,
			Usuario profesional) {
		
		this.nombreserv = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.duracion = duracion;
		this.precio = precio;
		this.profesional = profesional;
	}
	
	public long getServicioid() {
		return servicioid;
	}

	public void setServicioid(long servicioid) {
		this.servicioid = servicioid;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombreserv;
	}
	public void setNombre(String nombre) {
		this.nombreserv = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripción(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Usuario getProfesional() {
		return profesional;
	}

	public void setProfesional(Usuario profesional) {
		this.profesional = profesional;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	/*public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDia(String fecha) {
		String dia=fecha.substring(0, 2);
		return dia;
	}
	public String getMonth(String fecha) {
		String month=fecha.substring(3, 5);
		switch (month) {
		case "01":
			month="Enero";
			break;
		case "02":
			month="Febrero";
			break;
		case "03":
			month="Marzo";
			break;
		case "04":
			month="Abril";
			break;
		case "05":
			month="Mayo";
			break;
		case "06":
			month="Junio";
			break;
		case "07":
			month="Julio";
			break;
		case "08":
			month="Agosto";
			break;
		case "09":
			month="Septiembre";
			break;
		case "10":
			month="Octubre";
			break;
		case "11":
			month="Noviembre";
			break;
		case "12":
			month="Diciembre";
			break;
		
		default:
			break;
		}
		return month;
	}
	public String getYear(String fecha) {
		String year=fecha.substring(6);
		return year;
	}
	public void aceptar(String fecha,String hora,String lugar) {
		this.setFecha(fecha);
		this.setHora(hora);
		this.setLugar(lugar);
		
	}*/
}
