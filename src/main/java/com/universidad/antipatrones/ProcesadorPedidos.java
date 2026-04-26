package com.universidad.antipatrones;

public class ProcesadorPedidos {
    public void procesarPedido(Pedido pedido) {
        System.out.println("Procesando pedido: " + pedido.getId());
        double descuento = 0;
        String tipo = pedido.getTipoCliente();
        String promo = pedido.getCodigoPromo();
        double total = pedido.getTotal();

        if (tipo != null) {
            if (tipo.equals("VIP")) {
                if (total > 1000) {
                    descuento = 0.35;
                    if ("VIPEXTRA".equals(promo)) descuento = 0.45;
                } else { descuento = 0.15; }
            } else if (tipo.equals("PREMIUM")) {
                descuento = (total > 500) ? 0.20 : 0.10;
                if ("PREM10".equals(promo)) descuento = 0.15;
            } else { // ESTANDAR
                if (promo != null && promo.startsWith("FIRST")) descuento = 0.08;
            }
        }
        
        double totalFinal = total * (1 - descuento);
        System.out.printf(" Descuento aplicado: %.0f%% | Total final: $%.2f%n", descuento * 100, totalFinal);
    }
}