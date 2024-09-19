package com.example.tp_ddd.Classes;

import java.time.Instant;

public abstract class Eventos<T> {
    private final T id;
    private final Instant timestamp;

    public Eventos(T id) {
        this.id = id;
        this.timestamp = Instant.now();
    }

    public T getId() {
        return id;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
