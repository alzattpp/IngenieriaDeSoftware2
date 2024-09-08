package taller7;

public class SistemaEnvios {

    private IProcesarOrden procesarOrden;

    public SistemaEnvios(IProcesarOrden procesarOrden) {
        this.procesarOrden = procesarOrden;
    }

    public void enviarOrden(Orden orden) {
        procesarOrden.enviarOrden(orden);
    }
}
