/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12indireccion;

/**
 *
 * @author alzat
 */
public class GestorEnvioCorreos {
  
    private EnvioCorreo enviador;

    public GestorEnvioCorreos(EnvioCorreo enviador) {
        this.enviador = enviador;
    }

    public void enviarCorreo(Correo correo) {
        enviador.enviar(correo);
    }
}