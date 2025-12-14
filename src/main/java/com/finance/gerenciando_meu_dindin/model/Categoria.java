package com.finance.gerenciando_meu_dindin.model;

import java.util.List;

public class Categoria {
    
    private Long idCategoria;
    private String nomeCategoria;
    private String descricaoCategoria;
    private Usuario usuario;
    private List<Transacao> transacoes;

    public Categoria() { }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Transacao> getTransacao() {
        return transacoes;
    }

    public void setTransacao(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

}
