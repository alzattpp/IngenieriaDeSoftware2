package taller62;

/**
 *
 * @author alzat
 */
public abstract class Paquete {
    protected double peso;
    protected double dimensiones;

    public Paquete(double peso, double dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }
}
