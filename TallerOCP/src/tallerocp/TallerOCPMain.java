package tallerocp;

public class TallerOCPMain {
    public static void main(String[] args) {
        Envio envioEstandar = new EnvioEstandarService();
        Envio envioExpress = new EnvioExpressService();
        Envio envioInternacional = new EnvioInternacionalService();

        double costoEstandar = envioEstandar.calcularCosto(10, 100);
        double costoExpress = envioExpress.calcularCosto(10, 100);
        double costoInternacional = envioInternacional.calcularCosto(10, 100);

        System.out.println("Costo Envio Estandar: " + costoEstandar);
        System.out.println("Costo Envio Express: " + costoExpress);
        System.out.println("Costo Envio Internacional: " + costoInternacional);
        
        System.out.println("El codigo actual rompe el OCP porque necesita ser modificado cada vez que se añade un nuevo tipo de envio");
        System.out.println("Tendriamos que modificar el codigo existente, lo que aumenta la complejidad y va en contra del OCP.");
        System.out.println("La seccin if else en el metodo calcularCosto es la que se deberia modificar para añadir nuevos tipos de envio.");
    }
}
