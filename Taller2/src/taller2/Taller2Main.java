package Taller2;

public class Taller2Main {
    public static void main(String[] args) {

        FacturaService facturaService = new FacturaService();
        ClienteService clienteService = new ClienteService();
        CorreoService correoService = new CorreoService();
        ReporteService reporteService = new ReporteService();

  
        facturaService.guardarFactura();
        facturaService.guardarFactura();  
        clienteService.guardarCliente();
        correoService.enviarEmailFactura();

   
        reporteService.generarReporteFacturas(facturaService.obtenerFacturas());

        correoService.enviarFacturaDian();
    
      
        System.out.println("Responsabilidades: guardar facturas, manejar la informacion del cliente, enviar correos electronicos, y generar reportes. Estas son tareas distintas que deberian estar separadas en diferentes clases para facilitar el mantenimiento y la escalabilidad del codigo.");
        System.out.println("La clase Factura fue dividida en varias clases. La separacio fue paea que cada clase tenga una unica responsabilidad.");
    }
}