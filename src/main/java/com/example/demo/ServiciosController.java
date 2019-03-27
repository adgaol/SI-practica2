package com.example.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/control")
public class ServiciosController {
	@Autowired
	private UsuarioRepository users;/**/
	
	@Autowired
	private ServicioRepository servicios;/**/
	
	@Autowired
	private SolicitudRepository solicitudes;/**/
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
	@DeleteMapping(value="/borrarServicios/{id}")
	    public void delete(@PathVariable String id){
	        servicios.deleteById(Long.parseLong(id));
	    }
	@PutMapping(value = "/updatedServicios/{id}/{nombre}/{descripcion}/{categoria}/{duracion}/{precio}")
		public void updated(@PathVariable String id,@PathVariable String nombre,@PathVariable String descripcion,@PathVariable String categoria,@PathVariable String duracion,@PathVariable String precio) {
			Servicio service=servicios.findById(Long.parseLong(id)).get();
			if(!nombre.equals("null")) {
				service.setNombre(nombre);
			}
			if(!descripcion.equals("null")) {
				service.setDescripcion(descripcion);
			}
			if(!categoria.equals("null")) {
				service.setCategoria(categoria);
			}
			if(!duracion.equals("null")) {
				service.setDuracion(Integer.parseInt(duracion));
			}
			if(!precio.equals("null")) {
				service.setPrecio(Double.parseDouble(precio));
			}
			servicios.save(service);
		}
}
