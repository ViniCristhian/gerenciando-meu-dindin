package com.finance.gerenciando_meu_dindin.service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.finance.gerenciando_meu_dindin.dto.UsuarioDTO;
import com.finance.gerenciando_meu_dindin.model.Usuario;
import com.finance.gerenciando_meu_dindin.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public ResponseEntity<UsuarioDTO> buscarPorId(Long id) {
        if (!usuarioRepository.existsById(id))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ID não existe");

        return usuarioRepository.findById(id)
                .map(r -> ResponseEntity.ok(UsuarioDTO.converter(r)))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Usuario> cadastroUsuario(Usuario usuario) {
        if (usuarioRepository.existsByEmail(usuario.getEmail()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email já cadastrado");
        else if (Optional.of(usuarioRepository.save(usuario)).isPresent())
            return ResponseEntity.status(HttpStatus.CREATED).build();
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
