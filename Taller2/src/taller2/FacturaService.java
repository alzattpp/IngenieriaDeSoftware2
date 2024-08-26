package Taller2;

import java.util.ArrayList;
import java.util.List;

public class FacturaService {
    private List<String> facturas;

    public FacturaService() {
        this.facturas = new ArrayList<>();
    }

    public void guardarFactura() {

  String nuevaFactura = "Factura " + (facturas.size() + 1) + " - Monto: " + (1000000 + facturas.size() * 100000) + " $";
        facturas.add(nuevaFactura);
        System.out.println("Factura guardada: " + nuevaFactura);
    }

    public List<String> obtenerFacturas() {
        return facturas;
    }
}
