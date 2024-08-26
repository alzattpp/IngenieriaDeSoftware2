package Taller2;

import java.util.List;

public class ReporteService {
    public void generarReporteFacturas(List<String> facturas) {
        System.out.println("Generando reporte de facturas...");

        if (facturas.isEmpty()) {
            System.out.println("No hay facturas para el mes actual.");
        } else {
            int totalFacturas = facturas.size();
            int montoTotal = 0;

            for (String factura : facturas) {
                System.out.println(factura);
                
                String[] partes = factura.split("Monto: ");
                int monto = Integer.parseInt(partes[1].replace(" $", ""));
                montoTotal += monto;
            }

            System.out.println("\n--- Resumen del Reporte ---");
            System.out.println("Total de facturas: " + totalFacturas);
            System.out.println("Monto total facturado: " + montoTotal + " $");
        }
    }
}
