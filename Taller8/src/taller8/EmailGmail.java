/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package taller8;

/**
 *
 * @author alzat
 */
public class EmailGmail extends Email{
    public String image;

    public EmailGmail(String to, String subject, String body, String image){
        super(to, subject, body);
        this.image = image; 
    }
}