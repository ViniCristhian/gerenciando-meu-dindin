package com.finance.gerenciando_meu_dindin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.gerenciando_meu_dindin.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

   public boolean existsByEmail(String email);

   public Optional<Usuario> findByEmail(String email);

}