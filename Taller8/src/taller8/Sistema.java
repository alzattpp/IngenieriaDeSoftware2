/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8;

/**
 *
 * @author alzat
 */
public class Sistema {
    public ServicioEmail email;

    public Sistema(ServicioEmail email){
        this.email = email;
    }

    public void enviarEmail(){
        email.enviarEmail();
    }
}