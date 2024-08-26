package tallerocp;

public class EnvioEstandarService extends Envio {
    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 0.5 + distancia * 0.1;
    }
}
