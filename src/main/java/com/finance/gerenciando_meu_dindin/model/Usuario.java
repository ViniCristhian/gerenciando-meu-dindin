package com.finance.gerenciando_meu_dindin.model;

import java.time.ZonedDateTime;
import java.util.List;

public class Usuario {
    
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private ZonedDateTime dataCadastro;
    private List<Categoria> categorias;
    private List<Transacao> transacoes;

    public Usuario() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ZonedDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(ZonedDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

}
