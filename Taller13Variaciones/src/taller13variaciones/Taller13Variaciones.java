/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller13variaciones;

/**
 *
 * @author alzat
 */
public class Taller13Variaciones {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        CanalNotificacion canalCorreo = new CanalCorreoElectronico();
        
        Notificador notificador = new Notificador(canalCorreo);
        
        Notificacion notificacion = new Notificacion("Nueva notificacion", "Notificacion de prueba :D");
        
        notificador.enviarNotificacion(notificacion);

        CanalNotificacion canalSMS = new CanalSMS();
        notificador = new Notificador(canalSMS);
        notificador.enviarNotificacion(notificacion);

        CanalNotificacion canalWhatsApp = new CanalWhatsApp();
        notificador = new Notificador(canalWhatsApp);
        notificador.enviarNotificacion(notificacion);
    }
}