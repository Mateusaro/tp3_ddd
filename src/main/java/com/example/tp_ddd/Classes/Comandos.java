package com.example.tp_ddd.Classes;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public abstract class Comandos<T> {
    @TargetAggregateIdentifier
    private final T id;

    public Comandos(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
