package taller4;

public class CalculoImpuestoSaludable extends Calculo {

    public CalculoImpuestoSaludable(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return precio * cantidad * 0.05;
    }
}
