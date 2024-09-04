package taller62;

public class Taller62 {

    public static void main(String[] args) {
 
        IPaquete paquetePequeno = new PaquetePequeno(2.5, 15.0, 100);
        IPaquete paqueteGrande = new PaqueteGrande(10.0, 30.0, 500, "Aéreo");
        PaquetePeligroso paquetePeligroso = new PaquetePeligroso(8.0, 600, "Inflamable", true);

        System.out.println("Paquete pequeno:");
        paquetePequeno.calcularCostoEnvioPequeno();

        System.out.println("\nPaquete grande:");
        paqueteGrande.calcularCostoEnvioGrande();

        System.out.println("\nPaquete peligroso:");
        paquetePeligroso.verificarContenidoPeligroso();
        paquetePeligroso.asegurarPaquetePeligroso(true);
        paquetePeligroso.calcularCostoEnvioPeligroso();
    }
}
