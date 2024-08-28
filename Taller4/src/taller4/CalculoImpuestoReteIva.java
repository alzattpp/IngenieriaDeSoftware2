package taller4;

public class CalculoImpuestoReteIva extends Calculo {

    public CalculoImpuestoReteIva(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return precio * cantidad * 0.10;
    }
}
