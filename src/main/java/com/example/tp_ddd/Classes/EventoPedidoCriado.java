package com.example.tp_ddd.Classes;


public class EventoPedidoCriado extends Eventos<String> {
    private final String descricao;

    public EventoPedidoCriado(String id, String descricao) {
        super(id);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
