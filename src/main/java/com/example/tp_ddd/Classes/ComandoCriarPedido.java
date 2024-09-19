package com.example.tp_ddd.Classes;

public class ComandoCriarPedido extends Comandos<String> {
    private final String descricao;

    public ComandoCriarPedido(String id, String descricao) {
        super(id);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
