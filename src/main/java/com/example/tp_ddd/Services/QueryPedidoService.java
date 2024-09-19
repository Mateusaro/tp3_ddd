package com.example.tp_ddd.Services;

import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QueryPedidoService {

    private final EventStore eventStore;

    public QueryPedidoService(EventStore eventStore) {
        this.eventStore = eventStore;
    }

    // Método para listar todos os eventos de um pedido específico
    public List<Object> listarEventosPorId(String pedidoId) {
        return eventStore.readEvents(pedidoId)
                .asStream()
                .map(s -> s.getPayload())
                .collect(Collectors.toList());
    }
}
