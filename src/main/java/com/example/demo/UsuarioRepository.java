package com.example.demo;

import java.util.List;

 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;




@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuarios")
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
	Usuario findByPassword(@Param("password") String password); 
}
