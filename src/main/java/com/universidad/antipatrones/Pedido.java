package com.universidad.antipatrones;

public class Pedido {
    private final String id, tipoCliente, codigoPromo;
    private final double total;

    public Pedido(String id, String tipoCliente, double total, String codigoPromo) {
        this.id = id; this.tipoCliente = tipoCliente; this.total = total; this.codigoPromo = codigoPromo;
    }
    public String getId() { return id; }
    public String getTipoCliente() { return tipoCliente; }
    public double getTotal() { return total; }
    public String getCodigoPromo() { return codigoPromo; }
}