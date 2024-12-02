/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_Abstract_Factory;

/**
 *
 * @author alzat
 */
public class ServicioEnvioRegularFactory implements ServicioEnvioFactory {
    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new ServicioEnvioRegular();
    }
}
