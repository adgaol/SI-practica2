package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "masDemandados", path = "masDemandados")
public interface MasDemandadosRpository extends CrudRepository<MasDemandados,Long>{
	@Query(value = "SELECT servicio.servicioid,servicio.nombreserv,COUNT(servicio.servicioid) AS count , usuario.nombre FROM servicio LEFT JOIN usuario on usuario.userid = servicio.userid LEFT JOIN solicitud ON solicitud.servicioid =servicio.servicioid WHERE solicitud.servicioid IS NOT NULL GROUP BY servicio.servicioid  ORDER BY count DESC", nativeQuery = true)
	//@Query(value = "SELECT noDemandados.id servicio.servicioid, servicio.categoria FROM servicio "/*LEFT JOIN usuario on usuario.userid = servicio.userid" LEFT JOIN solicitud ON solicitud.servicio_id = servicio.servicioid WHERE solicitud.servicio_id IS NULL ORDER BY servicio.nombre ASC"*/, nativeQuery = true)	
	List<MasDemandados> alls();
}
