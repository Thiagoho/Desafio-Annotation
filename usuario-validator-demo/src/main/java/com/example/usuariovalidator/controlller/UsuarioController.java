package com.example.usuariovalidator.controlller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.usuariovalidator.model.Usuario;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<String> cadastrar(@Valid @RequestBody Usuario usuario) {
        return ResponseEntity.ok("✅ Usuário cadastrado com sucesso: " + usuario.getNome());
    }
}

