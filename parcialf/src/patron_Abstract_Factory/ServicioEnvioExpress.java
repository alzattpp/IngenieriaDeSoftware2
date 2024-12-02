/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_Abstract_Factory;

/**
 *
 * @author alzat
 */
public class ServicioEnvioExpress extends ServicioEnvio {
    @Override
    public void enviar(String paquete) {
        System.out.println("ENVIANDO PAQUETE DE FORMA EXPRESS: " + paquete);
    }
}
