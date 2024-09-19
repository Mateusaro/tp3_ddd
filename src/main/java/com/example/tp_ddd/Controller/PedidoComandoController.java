package com.example.tp_ddd.Controller;

import com.example.tp_ddd.Services.PedidoComandoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoComandoController {

    @Autowired
    private PedidoComandoService commandService;

    @PostMapping
    public String criarPedido(@RequestParam String descricao) {
        return commandService.criarPedido(descricao);
    }
}
