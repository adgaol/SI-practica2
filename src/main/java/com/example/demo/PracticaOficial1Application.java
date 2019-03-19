package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import repositories.ServicioRepository;
import repositories.SolicitudRepository;
import repositories.UsuarioRepository;

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
    	
	 
        
    }
}

