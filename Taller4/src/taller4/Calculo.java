package taller4;

public abstract class Calculo {
    public String producto;
    public int cantidad;
    public double precio;

    public Calculo(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public abstract double calcularImpuesto();
}

