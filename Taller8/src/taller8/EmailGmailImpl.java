/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package taller8;

/**
 *
 * @author alzat
 */

public class EmailGmailImpl extends EmailGmail implements ServicioEmail{

    public EmailGmailImpl(String to, String subject, String body, String image) {
        super(to, subject, body, image);
    }

    @Override
    public void enviarEmail(){
        System.out.println("ENVIADO  EMAIL CON GMAIL");
    }
    
}