package com.example.tp_ddd.Controllers;

import com.example.tp_ddd.Services.QueryPedidoService;
import com.example.tp_ddd.Classes.Pedido;
import com.example.tp_ddd.Repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class QueryPedidoController {

    @Autowired
    private QueryPedidoService queryService;

    @Autowired
    private PedidoRepository pedidoRepository;

    // Endpoint para listar eventos de um pedido
    @GetMapping("/{id}/eventos")
    public List<Object> listarEventos(@PathVariable String id) {
        return queryService.listarEventosPorId(id);
    }

    // Endpoint para buscar um pedido pelo ID
    @GetMapping("/{id}")
    public Pedido buscarPedidoPorId(@PathVariable String id) {
        return pedidoRepository.findById(id).orElse(null);
    }
}
