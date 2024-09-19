package com.example.tp_ddd.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Pedido {

    @Id
    private String id;
    private String descricao;

    public Pedido() {}

    public Pedido(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
