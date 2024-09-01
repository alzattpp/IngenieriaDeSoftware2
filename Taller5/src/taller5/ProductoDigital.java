package taller5;

public class ProductoDigital extends Producto {
    private double tamanoArchivo;

    public ProductoDigital(String nombre, double precio, int cantidad, double tamanoArchivo) {
        super(nombre, precio, cantidad);
        this.tamanoArchivo = tamanoArchivo;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecio() * getCantidad() + tamanoArchivo * 0.05;
    }
}
