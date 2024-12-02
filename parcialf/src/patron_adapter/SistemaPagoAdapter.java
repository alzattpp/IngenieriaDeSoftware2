/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_adapter;

/**
 *
 * @author alzat
 */
public class SistemaPagoAdapter implements SistemaPago {
    private NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion;

    public SistemaPagoAdapter(NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion) {
        this.nuevoSistemaPagoOperacion = nuevoSistemaPagoOperacion;
    }

    @Override
    public void realizarPago() {
        NuevoSistemaPago cliente = new NuevoSistemaPago("Sergio", "1055753352", "sergioa.alzateg@autonoma.edu.co");
        nuevoSistemaPagoOperacion.crearSesion(cliente);
        nuevoSistemaPagoOperacion.validarCorreo(cliente);
        nuevoSistemaPagoOperacion.ValidarAutorizacion();
        nuevoSistemaPagoOperacion.realizarPago();
    }
}
