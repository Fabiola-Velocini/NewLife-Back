package com.beta.newlife.controller.dto;

import com.beta.newlife.model.Veiculo;

public class VeiculoDTO {
    private Long id;
    private Long idApartamento;
    private String placa;
    private String marca;
    private String modelo;
    private String cor;

    public VeiculoDTO (Veiculo veiculo) {
        this.id = veiculo.getId ();
        this.idApartamento = veiculo.getIdApartamento ();
        this.placa = veiculo.getPlaca ();
        this.marca = veiculo.getMarca ();
        this.modelo = veiculo.getModelo ();
        this.cor = veiculo.getCor ();
    }

    public Long getId() {
        return id;
    }

    public Long getIdApartamento() {
        return idApartamento;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

}
