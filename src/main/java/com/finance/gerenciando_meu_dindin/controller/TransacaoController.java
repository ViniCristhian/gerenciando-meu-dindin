package com.finance.gerenciando_meu_dindin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @GetMapping("/")
    public String getTest() {
        return "Teste de endpoint";
    }
    
}
