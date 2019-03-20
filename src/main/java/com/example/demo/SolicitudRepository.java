package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;




@RepositoryRestResource(collectionResourceRel = "solicitudes", path = "solicitudes")
public interface SolicitudRepository extends CrudRepository<Solicitud,Long> {
	 List<Solicitud> findAll(); 
  
}
