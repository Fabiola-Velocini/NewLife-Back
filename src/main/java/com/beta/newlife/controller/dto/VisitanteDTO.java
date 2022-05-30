package com.beta.newlife.controller.dto;

import com.beta.newlife.model.Visitante;

public class VisitanteDTO {

    private Long id;
    private Long idApartamento;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone1;
    private String telefone2;
    private String observacao;

    public VisitanteDTO (Visitante visitante) {
        this.id = visitante.getId ();
        this.idApartamento = visitante.getIdApartamento ();
        this.nome = visitante.getNome ();
        this.rg = visitante.getRg ();
        this.cpf = visitante.getCpf ();
        this.telefone1 = visitante.getTelefone1 ();
        this.telefone2 = visitante.getTelefone2 ();
        this.observacao = visitante.getObservacao ();
    }

    public Long getId() {
        return id;
    }

    public Long getIdApartamento() {
        return idApartamento;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public String getObservacao() {
        return observacao;
    }

}
