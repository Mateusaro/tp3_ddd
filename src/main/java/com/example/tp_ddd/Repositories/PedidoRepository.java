package com.example.tp_ddd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tp_ddd.Classes.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, String> {
}
