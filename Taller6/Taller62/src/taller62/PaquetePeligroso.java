package taller62;

public class PaquetePeligroso implements IPaquetePeligroso {

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Verificando el contenido peligroso del paquete.");
    }

    @Override
    public void asegurarPaquetePeligroso(boolean embalajeEspecial) {
        if (embalajeEspecial) {
            System.out.println("Asegurando el paquete peligroso con embalaje especial.");
        } else {
            System.out.println("Asegurando el paquete peligroso sin embalaje especial.");
        }
    }

    public void calcularCostoEnvioPeligroso() {
        double peso = 15.0;
        double tarifaPorKilo = 7.0;
        double costo = peso * tarifaPorKilo;
        double recargoPeligroso = 50.0;
        System.out.println("El costo de envio para un paquete peligroso es: $" + (costo + recargoPeligroso));
    }
}
