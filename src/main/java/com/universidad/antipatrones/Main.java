package com.universidad.antipatrones;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SelectorEstrategia selector = new SelectorEstrategia();
        
        List<Pedido> pedidos = List.of(
            new Pedido("P001", "VIP", 1200.0, "VIPEXTRA"),
            new Pedido("P002", "VIP", 600.0, "VIP20"),
            new Pedido("P003", "PREMIUM", 300.0, "PREM10"),
            new Pedido("P004", "ESTANDAR", 150.0, "FIRST50")
        );

        // Convertimos pedidos a comandos y los ejecutamos
        pedidos.stream()
            .map(p -> new ComandoProcesarPedido(p, selector.seleccionar(p.getTipoCliente())))
            .forEach(ComandoPedido::ejecutar);
    }
}