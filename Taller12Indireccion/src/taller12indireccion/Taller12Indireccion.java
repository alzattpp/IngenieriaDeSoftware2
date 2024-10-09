/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller12indireccion;

/**
 *
 * @author alzat
 */
public class Taller12Indireccion {
    
    public static void main(String[] args) {
        EnvioCorreo enviador = new EnvioCorreo();

        GestorEnvioCorreos gestor = new GestorEnvioCorreos(enviador);

        Correo correo = new Correo("sergioa.alzateg@autonoma.edu.co", "Correo de pueba", "");

        gestor.enviarCorreo(correo);
    }
}