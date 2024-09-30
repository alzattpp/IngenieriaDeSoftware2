/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10creator;

/**
 *
 * @author alzat
 */
public class Fabrica {
    public Computadora creaComputadora(String procesador, String tarjetaGrafica, int ram){
        return new Computadora(procesador, tarjetaGrafica, ram);
    }
}