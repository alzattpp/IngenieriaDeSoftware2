/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8;

/**
 *
 * @author alzat
 */
public class EmailOutlookImpl extends EmailOutlook implements ServicioEmail{
    public EmailOutlookImpl(String to, String subject, String body) {
        super(to, subject, body);
    }

    @Override
    public void enviarEmail(){
        System.out.println("ENVIADO  EMAIL CON OUTLOOK");
    }
}