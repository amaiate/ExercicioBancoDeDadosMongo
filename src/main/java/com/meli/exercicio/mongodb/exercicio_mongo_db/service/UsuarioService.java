package com.meli.exercicio.mongodb.exercicio_mongo_db.service;

import com.meli.exercicio.mongodb.exercicio_mongo_db.models.Usuario;
import com.meli.exercicio.mongodb.exercicio_mongo_db.models.UsuarioAlterarForm;
import com.meli.exercicio.mongodb.exercicio_mongo_db.models.UsuarioForm;
import com.meli.exercicio.mongodb.exercicio_mongo_db.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private Usuario usuario;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> findAllUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario addUsuario (Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario findUsuario(String id){
        return usuarioRepository.findById(id).get();
    }

    public void delete (String id){
       usuarioRepository.deleteById(id);
    }

    public Usuario putUsuario(UsuarioAlterarForm usuarioAlterarForm){
        Usuario usuario = usuarioRepository.findById(usuarioAlterarForm.getId()).get();
        usuario.setName(usuarioAlterarForm.getName());
        usuario.setIdade(usuarioAlterarForm.getIdade());
        return usuarioRepository.save(usuario);
    }
}
