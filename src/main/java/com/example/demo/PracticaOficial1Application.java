package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class PracticaOficial1Application implements CommandLineRunner{
	/*@Autowired
	private UsuarioRepository users;
	
	@Autowired
	private ServicioRepository servicios;
	
	@Autowired
	private SolicitudRepository solicitudes;*/

	public static void main(String[] args) {
		SpringApplication.run(PracticaOficial1Application.class, args);
	}
	 @Override
	 @Transactional
    public void run(String... strings) throws Exception {
		/*Usuario antonio=new Usuario("Antonio","Salvador Ortega","antonio@gmail.com","cliente1","CUSTOMER","19/09/1982","Madrid");
		Usuario laura=new Usuario("Laura","Sanchez Ramirez","laura@gmail.com","cliente2","CUSTOMER","23/05/1988","Barcelona");
		Usuario clara=new Usuario("Clara María","Baltasar Alonso","clara@gmail.com","cliente3","CUSTOMER","09/06/1997","Badajoz");
	    Usuario pepe=new Usuario("Pepe","Gómez Pérez","pepe@gmail.com","profesional1","PROFESIONAL","25/08/1979","Madrid");	
		Usuario pepa=new Usuario("Pepa","Ruiz Sanz","pepa@gmail.com","profesional2","PROFESIONAL","19/06/1985","Barcelona");
		Usuario eldelbar=new Usuario("Eldelbar","García Gonzalez","eldelbar@gmail.com","profesional3","PROFESIONAL","06/02/1995","Sevilla");
	    Usuario manuel=new Usuario("Manuel","García Martínez","manuel@gmail.com","analista1","ANALYST","23/05/1988","Sevilla");
		users.save(pepe);
		users.save(pepa);
		users.save(manuel);
		users.save(antonio);
		users.save(laura);
		users.save(clara);
		users.save(eldelbar);
		Servicio servicio1=new Servicio("Cambios de enchufes","Cambiamos tus enchufes","Electricista",2,30.25,pepe);
		Servicio servicio2=new Servicio("Desatranques pepa","Desantrancamos donde sea","Fontanería",3,50.0,pepa);
		Servicio servicio3=new Servicio("Reparto de pan","Llevamos pan a domicilio","Alimentación",2,30.25,eldelbar);
		Servicio servicio4=new Servicio("Instalación de red eléctrica","Instalamos redes eléctricas","Electricista",72,150.03,pepe);
		Servicio servicio5=new Servicio("Instalación de retretes","Instalamos retretes","Fontanería",5,70.25,pepa);
		Servicio servicio6=new Servicio("Café a domicilio","Si estas ocupado te llevamos el café con churros a la oficina","Alimentación",2,30.25,eldelbar);
		Servicio servicio7=new Servicio("Instalamos cuadros eléctricos","Si queires cambiar el cuadro electrico o instalarlo llamanos","Electricista",8,200.25,pepe);
		Servicio servicio8=new Servicio("Saneamientos de tuberías","Saneamos tus tuberías","Fontanería",5,85.25,pepa);
		Servicio servicio9=new Servicio("Instalación de grifos","Instalamos grifos ¡Sorpresa!","Fontanería",2,30.25,pepa);
		Servicio servicio10=new Servicio("Comida a domicilio","Llevamos tu tortilla de patata y una cerveza directamente a tu mesa,para 4 personas","Alimentación",1,30.25,eldelbar);
		servicios.save(servicio1);
		servicios.save(servicio2);
		servicios.save(servicio3);
		servicios.save(servicio4);
		servicios.save(servicio5);
		servicios.save(servicio6);
		servicios.save(servicio7);
		servicios.save(servicio8);
		servicios.save(servicio9);
		servicios.save(servicio10);
		//6 2 nunca
		//8 5 
	
		Solicitud solicitud1=new Solicitud(clara, servicio8, "12/12/2018", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud2=new Solicitud(antonio, servicio8, "01/01/2019", "Calle del medio, Madrid", 50.0, "COMPLETADO", "");
		Solicitud solicitud3=new Solicitud(laura, servicio8, "02/01/2019", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud4=new Solicitud(antonio, servicio5, "03/01/2019", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud5=new Solicitud(laura, servicio5, "04/01/2019", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud6=new Solicitud(clara, servicio1, "05/01/2019", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud7=new Solicitud(laura, servicio3, "06/01/2019", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud8=new Solicitud(antonio, servicio4, "07/01/2019", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud9=new Solicitud(clara, servicio5, "08/01/2019", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud10=new Solicitud(laura, servicio9, "09/01/2019", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud11=new Solicitud(antonio, servicio7, "10/01/2019", "Calle ibañez, Mostoles", 50.0, "COMPLETADO", "");
		Solicitud solicitud12=new Solicitud(antonio, servicio7, "10/01/2019", "Calle ibañez, Mostoles", 50.0, "PENDIENTE", "");
		solicitudes.save(solicitud1);
		solicitudes.save(solicitud2);
		solicitudes.save(solicitud3);
		solicitudes.save(solicitud4);
		solicitudes.save(solicitud5);
		solicitudes.save(solicitud6);
		solicitudes.save(solicitud7);
		solicitudes.save(solicitud8);
		solicitudes.save(solicitud9);
		solicitudes.save(solicitud10);
		solicitudes.save(solicitud11);
		solicitudes.save(solicitud12);*/
	 }
}

