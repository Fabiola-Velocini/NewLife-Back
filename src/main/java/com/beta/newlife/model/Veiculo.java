package com.beta.newlife.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.beta.newlife.controller.form.VeiculoForm;

@Entity
@Table (name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_veiculo")
    private Long id;

    @Column (name = "id_apartamento")
    private Long idApartamento;

    @Column (name = "placa")
    private String placa;

    @Column (name = "marca")
    private String marca;

    @Column (name = "modelo")
    private String modelo;

    @Column (name = "cor")
    private String cor;

    public Veiculo() {
    }

    public Veiculo(Long id, Long idApartamento, String placa, String marca, String modelo, String cor) {
        this.id = id;
        this.idApartamento = idApartamento;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Veiculo (VeiculoForm form) {
        this.idApartamento = form.getIdApartamento();
        this.placa = form.getPlaca ();
        this.marca = form.getMarca ();
        this.modelo = form.getModelo ();
        this.cor = form.getCor ();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Long idApartamento) {
        this.idApartamento = idApartamento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void update (VeiculoForm form) {
        this.idApartamento = form.getIdApartamento();
        this.placa = form.getPlaca ();
        this.marca = form.getMarca ();
        this.modelo = form.getModelo ();
        this.cor = form.getCor ();
    }

}
