package taller62;

public class PaqueteGrande implements IPaqueteGrande {

    @Override
    public void calcularCostoEnvioGrande() {
        double peso = 20.0;
        double tarifaPorKilo = 3.0;
        double costo = peso * tarifaPorKilo;
        System.out.println("El costo de envio para un paquete grande es: $" + costo);
    }
}
