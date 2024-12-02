/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_adapter;

/**
 *
 * @author alzat
 */
public class main {
    public static void main(String[] args) {
        NuevoSistemaPagoOperacion nuevoSistema = new NuevoSistemaPagoOperacion();
        SistemaPago sistemaPago = new SistemaPagoAdapter(nuevoSistema);
        sistemaPago.realizarPago();
    }
}
