package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "servUser", path = "servUser")
public interface servUserRepository extends CrudRepository<ServUser,Long>{
	@Query(value = "SELECT solicitud.solicitudid,solicitud.fecha ,solicitud.estado, usuario.nombre FROM servicio LEFT JOIN solicitud\r\n" + 
			"on solicitud.servicioid=servicio.servicioid LEFT JOIN usuario on usuario.userid=solicitud.userid where solicitud.solicitudid IS NOT null AND servicio.userid=:#{#id} ", nativeQuery = true)
	//@Query(value = "SELECT noDemandados.id servicio.servicioid, servicio.categoria FROM servicio "/*LEFT JOIN usuario on usuario.userid = servicio.userid" LEFT JOIN solicitud ON solicitud.servicio_id = servicio.servicioid WHERE solicitud.servicio_id IS NULL ORDER BY servicio.nombre ASC"*/, nativeQuery = true)	
	List<ServUser> alls(@Param("id")Long id);
}
