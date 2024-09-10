/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8;

/**
 *
 * @author alzat
 */
public class EmailYahooImpl extends EmailYahoo implements ServicioEmail{
    public EmailYahooImpl(String to, String subject, String body, String files) {
        super(to, subject, body, files);
    }

    @Override
    public void enviarEmail(){
        System.out.println("ENVIADO  EMAIL CON YAHOO");
    }
}