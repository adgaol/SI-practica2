package com.example.demo.homeCliente;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Servicios.*;

@Controller
public class homeClienteController {
	@RequestMapping("/buscarServicios")
	public String mostrarServicios( Model model) {
		
		LinkedList<Servicios> servicios=new LinkedList<>();
		Servicios servicio1=new Servicios("Fontanería", "Arreglar el desague", "Fontanería",20);
		Servicios servicio2=new Servicios("Carpintería","Colocar puerta a medida","Carpintería",30);
		servicios.add(servicio1);
		servicios.add(servicio2);
		model.addAttribute("servicios",servicios);

		return "buscarServicios";
	}
	@RequestMapping("/infoServicios")
	public String mostrarInfoServicios( Model model) {
		
		LinkedList<Servicios> servicios=new LinkedList<>();
		Servicios servicio1=new Servicios("Fontanería", "Arreglar el desague", "Fontanería",15);
		Servicios servicio2=new Servicios("Fontanería","Colocar puerta a medida","Carpintería",19);
		Servicios servicio3=new Servicios("Fontanería", "Arreglar el desague", "Fontanería",35);
		Servicios servicio4=new Servicios("Fontanería","Colocar puerta a medida","Carpintería",53);
		Servicios servicio5=new Servicios("Fontanería", "Arreglar el desague", "Fontanería",24);
		Servicios servicio6=new Servicios("Fontanería","Colocar puerta a medida","Carpintería",12);
		servicios.add(servicio1);
		servicios.add(servicio2);
		servicios.add(servicio3);
		servicios.add(servicio4);
		servicios.add(servicio5);
		servicios.add(servicio6);
		model.addAttribute("servicios",servicios);

		return "infoServicios";
	}
	@RequestMapping("/detallesDelServicio")
	public String mostrarInfoServicio( Model model) {
		
		Servicios servicio1=new Servicios("Fontanería", "Arreglar el desague", "Gran Via, Madrid",15);
		servicio1.setDescripcion("Descripción del servicio de fontanería");		
		Hora hora1 = new Hora(12,30,"14/02/2019");
		Hora hora2 = new Hora(17,15,"19/02/2019");
		Hora hora3 = new Hora(14,45,"22/02/2019");
		LinkedList<Hora> horas = new LinkedList<>();
		horas.add(hora1);
		horas.add(hora2);
		horas.add(hora3);
		servicio1.setHorasOcupadas(horas);
		model.addAttribute("servicio",servicio1);

		return "detallesDelServicio";
	}
}
