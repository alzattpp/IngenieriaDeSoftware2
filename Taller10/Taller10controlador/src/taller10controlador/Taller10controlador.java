/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller10controlador;

/**
 *
 * @author alzat
 */
public class Taller10controlador {
    public static void main(String[] args) {
        Entrada entrada = new Entrada("MEET&GREAT", 30000, true);
        ventaControlador controlador = new ventaControlador();
        controlador.agregarEntrada(entrada);
        System.out.println("");
        User usuario = new User();
        usuario.comprar("MEET&GREAT");
    }
}
