package taller5;

public class ProductoMixto extends Producto implements Envio {
    private double tamanoArchivo;
    private double peso;

    public ProductoMixto(String nombre, double precio, int cantidad, double peso, double tamanoArchivo) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamanoArchivo = tamanoArchivo;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecio() * getCantidad() + peso * 0.1 + tamanoArchivo * 0.05;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Enviando este producto mixto por correo: " + getNombre());
    }
}
