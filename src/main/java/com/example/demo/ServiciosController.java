package com.example.demo;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import models.Servicio;

@Controller
public class ServiciosController {
	/*@RequestMapping("/mostrarPendientes")
	public String mostrar( Model model) {
		
		LinkedList<Servicio> servicios=new LinkedList<>();
		Servicio servicio1=new Servicio("Fontanería", "Arreglar el desague", "Fontanería", 360, 100);
		Servicio servicio2=new Servicio("Carpintería","Colocar puerta a medida","Carpintería",400,200);
		servicios.add(servicio1);
		servicios.add(servicio2);
		model.addAttribute("servicios",servicios);

		return "serviciosPendientes";
	}
	@RequestMapping("/mostrarCalendario")
	public String mostrarC( Model model) {
		
		LinkedList<Servicio> servicios=new LinkedList<>();
		Servicio servicio1=new Servicio("Fontanería", "Arreglar el desague", "Fontanería", 360, 100);
		Servicio servicio2=new Servicio("Carpintería","Colocar puerta a medida","Carpintería",400,200);
		servicio1.aceptar("02/05/2019", "9:50", "Gran Via , Madrid");
		servicio2.aceptar("03/03/2019", "15:25", "calle Alcorcon , Mostoles");
		servicios.add(servicio1);
		servicios.add(servicio2);
		model.addAttribute("servicios",servicios);
		//model.addAttribute("dia", arg1)

		return "calendar";
	}*/
	
}
