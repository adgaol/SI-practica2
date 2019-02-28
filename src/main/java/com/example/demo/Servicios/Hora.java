package com.example.demo.Servicios;

public class Hora {
	private int horas;
	private int minutos;
	private String dia;
	public Hora(int horas, int minutos, String dia) {
		if ((horas >= 0)&&(horas < 24)) {
			this.horas = horas;
		}
		if ((minutos >= 0)&&(minutos < 60)) {
			this.minutos = minutos;
		}
		this.dia = dia;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	@Override
	public String toString() {
		return horas + ":" + minutos;
	}
	
	
	
}
