package com.beta.newlife.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "apartamentos")
public class Apartamento {

    @Id
    @Column (name = "id_apartamento")
    private Long id;

    public Apartamento() {
    }

    public Apartamento(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
