/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron_Abstract_Factory;

/**
 *
 * @author alzat
 */
public class main {
    public static void main(String[] args) {
        ServicioEnvioFactory factoryExpress = new ServicioEnvioExpressFactory();
        ServicioEnvio servicioExpress = factoryExpress.crearServicioEnvio();
        servicioExpress.enviar("Documento importante");

        ServicioEnvioFactory factoryRegular = new ServicioEnvioRegularFactory();
        ServicioEnvio servicioRegular = factoryRegular.crearServicioEnvio();
        servicioRegular.enviar("Paquete estandar");
    }
}

