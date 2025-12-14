package com.finance.gerenciando_meu_dindin.model;

public enum TipoTransacao {

    RECEITA(1, "Entrada"),
    DESPESA(2, "Saída");

    private Integer idTransacao;
    private String nomeTipoTransacao;
    

    TipoTransacao(Integer idTransacao, String nomeTipoTranscao) {
        this.idTransacao = idTransacao;
        this.nomeTipoTransacao = nomeTipoTranscao;
    }

    public Integer getIdTransacao() {
        return idTransacao;
    }

    public String getNomeTipoTransacao() {
        return nomeTipoTransacao;
    }

}
