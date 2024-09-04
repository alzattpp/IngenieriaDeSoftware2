package taller62;

/**
 *
 * @author alzat
 */
public class PaquetePeligroso extends Paquete implements IPaquete {

    private String etiquetasPeligro;
    private boolean embalajeEspecial;

    public PaquetePeligroso(double peso, double dimensiones, String etiquetasPeligro, boolean embalajeEspecial) {
        super(peso, dimensiones);
        this.etiquetasPeligro = etiquetasPeligro;
        this.embalajeEspecial = embalajeEspecial;
    }

    @Override
    public void calcularCostoEnvioPequeno() {}

    @Override
    public void calcularCostoEnvioGrande() {}

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Verificando contenido peligroso en el paquete.");
    }

    @Override
    public void asegurarPaquetePeligroso(boolean embalajeEspecial) {
        if (embalajeEspecial) {
            System.out.println("Asegurando el paquete peligroso con trato especial.");
        } else {
            System.out.println("El paquete peligroso no requiere trato especial.");
        }
    }

    public void calcularCostoEnvioPeligroso() {
        double costoEnvio = (peso * 2) + 50;
        System.out.println("El costo de envio del paquete peligroso es: " + costoEnvio);
    }
}
