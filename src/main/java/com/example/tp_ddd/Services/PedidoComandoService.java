package com.example.tp_ddd.Services;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tp_ddd.Classes.ComandoCriarPedido;

import java.util.UUID;

@Service
public class PedidoComandoService {

    private final CommandGateway commandGateway;

    @Autowired
    public PedidoComandoService(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    public String criarPedido(String descricao) {
        String id = UUID.randomUUID().toString();
        ComandoCriarPedido command = new ComandoCriarPedido(id, descricao);
        commandGateway.sendAndWait(command);
        return id;
    }
}
