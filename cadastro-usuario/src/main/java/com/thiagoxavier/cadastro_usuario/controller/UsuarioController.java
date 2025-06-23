package com.thiagoxavier.cadastro_usuario.controller;

import com.thiagoxavier.cadastro_usuario.business.UsuarioService;
import com.thiagoxavier.cadastro_usuario.infrastructure.entitys.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //Controler padrão REST
@RequestMapping("/usuario") //URI
@RequiredArgsConstructor

public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping //Busca dados
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email){
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping //Deleta dados
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email){
        usuarioService.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping //Atualiza dados
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id, @RequestBody Usuario usuario){
        usuarioService.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }
}
