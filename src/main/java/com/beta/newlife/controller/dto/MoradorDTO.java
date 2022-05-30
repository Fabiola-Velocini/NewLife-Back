package com.beta.newlife.controller.dto;

import com.beta.newlife.model.Morador;

public class MoradorDTO {

    private Long id;
    private Long idApartamento;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone1;
    private String telefone2;
    private String email;
    private String contatoEmergencia;
    private String ceTelefone;
    private String observacao;

    public MoradorDTO (Morador morador) {
        this.id = morador.getId ();
        this.idApartamento = morador.getIdApartamento ();
        this.nome = morador.getNome ();
        this.rg = morador.getRg ();
        this.cpf = morador.getCpf ();
        this.telefone1 = morador.getTelefone1 ();
        this.telefone2 = morador.getTelefone2 ();
        this.email = morador.getEmail ();
        this.contatoEmergencia = morador.getContatoEmergencia ();
        this.ceTelefone = morador.getCeTelefone ();
        this.observacao = morador.getObservacao ();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Long getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Long idApartamento) {
        this.idApartamento = idApartamento;
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

    public String getEmail() {
        return email;
    }

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public String getCeTelefone() {
        return ceTelefone;
    }

    public String getObservacao() {
        return observacao;
    }

}
