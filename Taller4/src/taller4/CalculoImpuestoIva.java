package taller4;

public class CalculoImpuestoIva extends Calculo {

    public CalculoImpuestoIva(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return precio * cantidad * 0.19;
    }
}
    