/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_adapter;

/**
 *
 * @author alzat
 */
public class NuevoSistemaPagoOperacion {
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("Creando sesion para: " + nuevoSistemaPago.getNombre());
    }

    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("Validadndo correo: " + nuevoSistemaPago.getCorreo());
    }

    public void ValidarAutorizacion() {
        System.out.println("Validanno autorizacion");
    }

    public void realizarPago() {
        System.out.println("Realizando el pago");
    }
}
