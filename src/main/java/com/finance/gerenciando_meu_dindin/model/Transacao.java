package com.finance.gerenciando_meu_dindin.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Transacao {
    
    private Long idTransacao;
    private BigDecimal valor;
    private ZonedDateTime dataTransacao;
    private Usuario usuario;
    private TipoTransacao tipoTransacao;
    private Categoria categoria;

    public Transacao() { }

    public Long getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(Long idTransacao) {
        this.idTransacao = idTransacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public ZonedDateTime getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(ZonedDateTime dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
