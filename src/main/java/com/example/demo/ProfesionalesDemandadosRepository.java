package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "profesionalesDemandados", path ="profesionalesDemandados")
public interface ProfesionalesDemandadosRepository extends CrudRepository<ProfesionalesDemandados,Long>{
	@Query(value = "SELECT usuario.userid, usuario.nombre,COUNT(servicio.userid) AS count  FROM servicio LEFT JOIN usuario on usuario.userid = servicio.userid LEFT JOIN solicitud ON solicitud.servicioid =servicio.servicioid WHERE solicitud.servicioid IS NOT NULL GROUP BY servicio.userid  ORDER BY count DESC, usuario.nombre ASC", nativeQuery = true)
	//@Query(value = "SELECT noDemandados.id servicio.servicioid, servicio.categoria FROM servicio "/*LEFT JOIN usuario on usuario.userid = servicio.userid" LEFT JOIN solicitud ON solicitud.servicio_id = servicio.servicioid WHERE solicitud.servicio_id IS NULL ORDER BY servicio.nombre ASC"*/, nativeQuery = true)	
	List<ProfesionalesDemandados> alls();
}
