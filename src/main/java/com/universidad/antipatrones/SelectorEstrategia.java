package com.universidad.antipatrones;

import java.util.Map;

public class SelectorEstrategia {
    // Definimos el mapa de estrategias como una constante inmutable [cite: 1000]
    private final Map<String, EstrategiaDescuento> estrategias = Map.of(
        "VIP", new DescuentoVIP(),
        "PREMIUM", new DescuentoPremium(),
        "ESTANDAR", new DescuentoEstandar()
    );

    public EstrategiaDescuento seleccionar(String tipoCliente) {
        // Retornamos la estrategia correspondiente o ESTANDAR por defecto [cite: 1006-1009]
        return estrategias.getOrDefault(tipoCliente, estrategias.get("ESTANDAR"));
    }
}