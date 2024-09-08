package taller7;

import java.util.Date;

public class Taller7 {

    public static void main(String[] args) {
        Orden orden = new Orden(new Date(), "MANIZALES", "BOGOTA");

        IProcesarOrdenDHL servicioDHL = new ProcesarOrdenDHLImpl();
        SistemaEnvios sistemaEnviosDHL = new SistemaEnvios(servicioDHL);
        sistemaEnviosDHL.enviarOrden(orden);

        IProcesarOrdenFedex servicioFedEx = new ProcesarOrdenFedexImpl();
        SistemaEnvios sistemaEnviosFedEx = new SistemaEnvios(servicioFedEx);
        sistemaEnviosFedEx.enviarOrden(orden);

        IProcesarOrdenUPS servicioUPS = new ProcesarOrdenUPSImpl();
        SistemaEnvios sistemaEnviosUPS = new SistemaEnvios(servicioUPS);
        sistemaEnviosUPS.enviarOrden(orden);
    }
}
