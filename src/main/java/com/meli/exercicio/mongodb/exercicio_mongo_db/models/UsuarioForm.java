package com.meli.exercicio.mongodb.exercicio_mongo_db.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioForm {


    private String name;
    private Integer idade;


    public static Usuario converter (UsuarioForm usuarioForm){
        return new Usuario(usuarioForm.name, usuarioForm.idade);

    }
}
