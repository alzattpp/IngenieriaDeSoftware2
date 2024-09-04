package taller62;

/**
 *
 * @author alzat
 */
public class PaqueteGrande extends Paquete implements IPaquete {

    private double volumen;
    private String medioTransporte;

    public PaqueteGrande(double peso, double dimensiones, double volumen, String medioTransporte) {
        super(peso, dimensiones);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    @Override
    public void calcularCostoEnvioPequeno() {}

    @Override
    public void calcularCostoEnvioGrande() {
        double costoEnvio = (peso * 1.5) + (volumen * 0.1);
        System.out.println("El costo de envio del paquete grande es: " + costoEnvio);
    }

    @Override
    public void verificarContenidoPeligroso() {}

    @Override
    public void asegurarPaquetePeligroso(boolean embalajeEspecial) {}
}
