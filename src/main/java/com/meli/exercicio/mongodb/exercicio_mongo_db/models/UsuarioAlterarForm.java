package com.meli.exercicio.mongodb.exercicio_mongo_db.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioAlterarForm {

    private String id;
    private String name;
    private Integer idade;


    public static Usuario converter (UsuarioAlterarForm usuarioAlterarForm){
        return new Usuario(usuarioAlterarForm.name, usuarioAlterarForm.idade);

    }
}
