package com.finance.gerenciando_meu_dindin.dto;

import com.finance.gerenciando_meu_dindin.model.Usuario;

public record UsuarioDTO(String nome, String email) {

    public static UsuarioDTO converter(Usuario usuario) {
        return new UsuarioDTO(usuario.getNome(), usuario.getEmail());
    }
}