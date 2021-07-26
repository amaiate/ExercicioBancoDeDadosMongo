package com.meli.exercicio.mongodb.exercicio_mongo_db.repository;

import com.meli.exercicio.mongodb.exercicio_mongo_db.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
