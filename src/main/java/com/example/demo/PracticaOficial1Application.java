package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class PracticaOficial1Application implements CommandLineRunner{
	@Autowired
	private UsuarioRepository users;
	
	@Autowired
	private ServicioRepository servicios;
	
	@Autowired
	private SolicitudRepository solicitudes;

	public static void main(String[] args) {
		SpringApplication.run(PracticaOficial1Application.class, args);
	}
	 @Override
	 @Transactional
    public void run(String... strings) throws Exception {
    Usuario pepe=new Usuario("Pepe","Gómez Pérez","pepe@gmail.com","contraseña1","PROFESIONAL","25/08/1979","Madrid");	
	Usuario pepa=new Usuario("Pepa","Ruiz Sanz","pepa@gmail.com","contraseña2","PROFESIONAL","19/06/1985","Barcelona"); 
    Usuario manuel=new Usuario("Manuel","García Martínez","manuel@gmail.com","contraseña3","PROFESIONAL","23/05/1988","Sevilla");
	users.save(pepe);
	 users.save(pepa);
	 users.save(manuel);
    }
}

