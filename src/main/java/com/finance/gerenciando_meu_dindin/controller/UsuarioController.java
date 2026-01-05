package com.finance.gerenciando_meu_dindin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.gerenciando_meu_dindin.dto.UsuarioDTO;
import com.finance.gerenciando_meu_dindin.model.Usuario;
import com.finance.gerenciando_meu_dindin.service.UsuarioService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/")
    public String getTest() {
        return "Teste de endpoint";
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getUsuarioId(@PathVariable("id") Long id) {
        return usuarioService.buscarPorId(id);
    } 

    @PostMapping("/cadastro")
    public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario) {
        return usuarioService.cadastroUsuario(usuario);
    }


}
