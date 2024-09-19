package com.example.tp_ddd.Classes;

import com.example.tp_ddd.Classes.ComandoCriarPedido;
import com.example.tp_ddd.Classes.EventoPedidoCriado;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;

@Aggregate
public class PedidoAgregado {

    @AggregateIdentifier
    private String id;
    private String descricao;

    // Construtor sem argumentos exigido pelo Axon
    public PedidoAgregado() {
    }

    // Command Handler: Lida com o comando CriarPedidoCommand
    @CommandHandler
    public PedidoAgregado(ComandoCriarPedido command) {
        // Aplica o evento de criação do pedido
        AggregateLifecycle.apply(new EventoPedidoCriado(command.getId(), command.getDescricao()));
    }

    // Event Sourcing Handler: Atualiza o estado do agregador com base no evento
    @EventSourcingHandler
    public void on(EventoPedidoCriado event) {
        this.id = event.getId();
        this.descricao = event.getDescricao();
    }
}
