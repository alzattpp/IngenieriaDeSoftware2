/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8;

/**
 *
 * @author alzat
 */
public class Taller8 {
    public static void main(String[] args) {
        ServicioEmail servicioEmail1 = new EmailGmailImpl(null, null, null, null);
        ServicioEmail servicioEmail2 = new EmailYahooImpl(null, null, null, null);
        ServicioEmail servicioEmail3 = new EmailOutlookImpl(null, null, null);
        Sistema sistema = new Sistema(servicioEmail1);
        sistema.enviarEmail();
        sistema = new Sistema(servicioEmail2);
        sistema.enviarEmail();
        sistema = new Sistema(servicioEmail3);
        sistema.enviarEmail();


    }
}
