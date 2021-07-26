package com.meli.exercicio.mongodb.exercicio_mongo_db.controller;

import com.meli.exercicio.mongodb.exercicio_mongo_db.models.Usuario;
import com.meli.exercicio.mongodb.exercicio_mongo_db.models.UsuarioAlterarForm;
import com.meli.exercicio.mongodb.exercicio_mongo_db.models.UsuarioForm;
import com.meli.exercicio.mongodb.exercicio_mongo_db.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {


    private UsuarioService usuarioService;


    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PostMapping
    public ResponseEntity<?> post(@RequestBody UsuarioForm usuarioForm){
        usuarioService.addUsuario(UsuarioForm.converter(usuarioForm));
        return ResponseEntity.ok(usuarioForm);
    }

    @GetMapping
    public List<Usuario> get (){
        return usuarioService.findAllUsuarios();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Usuario get (@PathVariable String id){
        return usuarioService.findUsuario(id);
    }

    @DeleteMapping
    @RequestMapping("/delete/{id}")
    public ResponseEntity<?> delete (@PathVariable String id){
        usuarioService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @RequestMapping("/alterar")
    public ResponseEntity<?> alterar (@RequestBody UsuarioAlterarForm usuarioAlterarForm){
    usuarioService.putUsuario(usuarioAlterarForm);
    return ResponseEntity.ok().build();
    }
}
