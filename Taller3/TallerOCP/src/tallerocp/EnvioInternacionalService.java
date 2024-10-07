package tallerocp;

public class EnvioInternacionalService extends Envio {
    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 1.5 + distancia * 0.5;
    }
}
