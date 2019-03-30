package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "masIngresos", path = "masIngresos")
public interface MasIngresosRpository extends CrudRepository<MasIngresos,Long>{
	@Query(value = "SELECT servicio.servicioid,servicio.nombreserv , usuario.nombre ,SUM(solicitud.importe) as ingresos,COUNT(solicitud.estado) as count FROM servicio LEFT JOIN usuario on usuario.userid = servicio.userid LEFT JOIN solicitud ON solicitud.servicioid =servicio.servicioid WHERE solicitud.servicioid IS NOT NULL AND solicitud.estado IN(\"COMPLETADO\") GROUP BY servicio.servicioid ORDER BY ingresos DESC", nativeQuery = true)
	//@Query(value = "SELECT noDemandados.id servicio.servicioid, servicio.categoria FROM servicio "/*LEFT JOIN usuario on usuario.userid = servicio.userid" LEFT JOIN solicitud ON solicitud.servicio_id = servicio.servicioid WHERE solicitud.servicio_id IS NULL ORDER BY servicio.nombre ASC"*/, nativeQuery = true)	
	List<MasIngresos> alls();
}
