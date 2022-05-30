package com.beta.newlife.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.beta.newlife.controller.form.VisitanteForm;

@Entity
@Table (name = "visitantes")
public class Visitante {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_visitante")
    private Long id;

    @Column (name = "id_apartamento")
    private Long idApartamento;

    @Column (name = "nome")
    private String nome;

    @Column (name = "rg")
    private String rg;

    @Column (name = "cpf")
    private String cpf;

    @Column (name = "telefone1")
    private String telefone1;

    @Column (name = "telefone2")
    private String telefone2;

    @Column (name = "observacao")
    private String observacao;

    public Visitante() {
    }

    public Visitante(Long id, Long idApartamento, String nome, String rg, String cpf, String telefone1,
            String telefone2, String observacao) {
        this.id = id;
        this.idApartamento = idApartamento;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.observacao = observacao;
    }

    public Visitante (VisitanteForm form) {
        this.idApartamento = form.getIdApartamento();
        this.nome = form.getNome ();
        this.rg = form.getRg ();
        this.cpf = form.getCpf ();
        this.telefone1 = form.getTelefone1 ();
        this.telefone2 = form.getTelefone2 ();
        this.observacao = form.getObservacao ();
   
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void update (VisitanteForm form) {
        this.idApartamento = form.getIdApartamento();
        this.nome = form.getNome ();
        this.rg = form.getRg ();
        this.cpf = form.getCpf ();
        this.telefone1 = form.getTelefone1 ();
        this.telefone2 = form.getTelefone2 ();
        this.observacao = form.getObservacao ();
    }
}
