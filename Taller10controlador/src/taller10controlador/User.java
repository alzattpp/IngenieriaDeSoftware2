/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10controlador;

/**
 *
 * @author alzat
 */
public class User {
    private ventaControlador controlador = new ventaControlador();
    public void comprar(String tipoEntada){
        controlador.comprarEntrada(tipoEntada);
    }
}