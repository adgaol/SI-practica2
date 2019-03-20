package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;




@RepositoryRestResource(collectionResourceRel = "servicios", path = "servicios")
public interface ServicioRepository extends CrudRepository<Servicio,Long>{

}
