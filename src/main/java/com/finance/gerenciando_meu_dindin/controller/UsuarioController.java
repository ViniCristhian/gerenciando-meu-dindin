package com.finance.gerenciando_meu_dindin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/")
    public String getTest() {
        return "Teste de endpoint";
    }
    
}
