package taller5;

public class ProductoFisico extends Producto implements Envio {
    private double peso;

    public ProductoFisico(String nombre, double precio, int cantidad, double peso) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecio() * getCantidad() + peso * 0.1;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Enviando este producto fisico por correo: " + getNombre());
    }
}
