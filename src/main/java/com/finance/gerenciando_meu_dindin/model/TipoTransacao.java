package com.finance.gerenciando_meu_dindin.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_transacao")
public class TipoTransacao {

    @Id
    private Integer idTipoTransacao;
    private String nomeTipoTransacao;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoTransacao", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("tipoTransacao")
    List<Transacao> transacoes;

    public TipoTransacao() { }

    public Integer getIdTipoTransacao() {
        return idTipoTransacao;
    }

    public void setIdTipoTransacao(Integer idTipoTransacao) {
        this.idTipoTransacao = idTipoTransacao;
    }

    public String getNomeTipoTransacao() {
        return nomeTipoTransacao;
    }

    public void setNomeTipoTransacao(String nomeTipoTransacao) {
        this.nomeTipoTransacao = nomeTipoTransacao;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

}
