package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "noDemandados", path = "noDemandados")
public interface NoDemandadosRepository extends CrudRepository<NoDemandados,Long>{
	//@Query(value = "SELECT servicio.servicioid,servicio.nombreserv , usuario.nombre FROM servicio LEFT JOIN usuario on usuario.userid = servicio.userid LEFT JOIN solicitud ON solicitud.servicioid =servicio.servicioid WHERE solicitud.servicioid IS NULL ORDER BY servicio.nombreserv ASC", nativeQuery = true)
	@Query(value = "SELECT servicio.servicioid,servicio.nombreserv , usuario.nombre FROM servicio LEFT JOIN usuario on usuario.userid = servicio.userid LEFT JOIN solicitud ON solicitud.servicioid =servicio.servicioid WHERE solicitud.servicioid IS NULL ORDER BY servicio.nombreserv ASC, servicio.nombreserv ASC ", nativeQuery = true)
	//@Query(value = "SELECT noDemandados.id servicio.servicioid, servicio.categoria FROM servicio "/*LEFT JOIN usuario on usuario.userid = servicio.userid" LEFT JOIN solicitud ON solicitud.servicio_id = servicio.servicioid WHERE solicitud.servicio_id IS NULL ORDER BY servicio.nombre ASC"*/, nativeQuery = true)	
	List<NoDemandados> alls();
}
//