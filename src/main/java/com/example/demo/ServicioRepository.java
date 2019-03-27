package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;




@RepositoryRestResource(collectionResourceRel = "servicios", path = "servicios")
public interface ServicioRepository extends CrudRepository<Servicio,Long>{
	List<Servicio> findByProfesional(@Param("profesional") Usuario user);
	Servicio findByServicioid(@Param("servicioid") long id);
	@Query(value = "SELECT servicio.nombre,usuario.nombre \r\n" + 
			"  FROM servicio\r\n" + 
			"LEFT JOIN usuario\r\n" + 
			"on usuario.userid = servicio.userid\r\n" + 
			"  LEFT JOIN solicitud\r\n" + 
			"    ON solicitud.servicio_id = servicio.servicioid \r\n" + 
			" WHERE solicitud.servicio_id IS NULL \r\n" +  
			" ORDER BY servicio.nombre ASC", nativeQuery = true)
    List<Servicio> noDemandados();
	
}
