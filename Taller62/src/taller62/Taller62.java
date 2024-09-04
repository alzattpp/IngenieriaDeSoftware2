package taller62;

public class Taller62 {
    public static void main(String[] args) {
        IPaquetePequeno paquetePequeno = new PaquetePequeno();
        paquetePequeno.calcularCostoEnvioPequeno();

        IPaqueteGrande paqueteGrande = new PaqueteGrande();
        paqueteGrande.calcularCostoEnvioGrande();

        PaquetePeligroso paquetePeligroso = new PaquetePeligroso();
        paquetePeligroso.verificarContenidoPeligroso();
        paquetePeligroso.asegurarPaquetePeligroso(true);
        paquetePeligroso.calcularCostoEnvioPeligroso();
    }
}
