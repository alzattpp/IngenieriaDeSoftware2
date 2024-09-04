package taller62;

public class PaquetePequeno implements IPaquetePequeno {

    @Override
    public void calcularCostoEnvioPequeno() {
        double peso = 2.5;
        double tarifaPorKilo = 5.0;
        double costo = peso * tarifaPorKilo;
        System.out.println("El costo de envio para un paquete pequeno es: $" + costo);
    }
}

