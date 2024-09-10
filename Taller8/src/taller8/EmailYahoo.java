/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8;

/**
 *
 * @author alzat
 */
public class EmailYahoo extends Email{
    public String files;

    public EmailYahoo(String to, String subject, String body, String files){
        super(to, subject, body);
        this.files = files; 
     }
}