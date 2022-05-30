package com.beta.newlife.controller.dto;

import com.beta.newlife.model.Apartamento;

public class ApartamentoDTO {

    private Long id;

    public ApartamentoDTO (Apartamento apartamento) {
        this.id = apartamento.getId ();
    }

    public Long getId() {
        return id;
    }

}
