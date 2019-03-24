package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;




@RepositoryRestResource(collectionResourceRel = "servicios", path = "servicios")
public interface ServicioRepository extends CrudRepository<Servicio,Long>{
	List<Servicio> findByProfesional(@Param("profesional") Usuario user);

	
	
}
