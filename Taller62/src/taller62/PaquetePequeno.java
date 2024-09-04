package taller62;

/**
 *
 * @author alzat
 */
public class PaquetePequeno extends Paquete implements IPaquete {

    private double valorDeclarado;

    public PaquetePequeno(double peso, double dimensiones, double valorDeclarado) {
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public void calcularCostoEnvioPequeno() {
        double costoEnvio = (peso * 2) + (valorDeclarado * 0.05);
        System.out.println("El costo de envio del paquete pequeno es: " + costoEnvio);
    }

    @Override
    public void calcularCostoEnvioGrande() {}

    @Override
    public void verificarContenidoPeligroso() {}

    @Override
    public void asegurarPaquetePeligroso(boolean embalajeEspecial) {}
}
