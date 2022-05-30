package com.beta.newlife.controller.dto;

public class DescricaoUsuarioDTO {
    private String escopo;
    private String nome;

    public DescricaoUsuarioDTO() {
    }

    public String getScope() {
        return escopo;
    }

    public void setScope(String escopo) {
        this.escopo = escopo;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

}
