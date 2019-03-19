package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import models.Solicitud;



public interface SolicitudRepository extends CrudRepository<Solicitud,Long> {
	 List<Solicitud> findAll(); 
  
}
