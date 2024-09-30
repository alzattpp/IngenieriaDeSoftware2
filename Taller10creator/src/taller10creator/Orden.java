/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10creator;

/**
 *
 * @author alzat
 */
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private Fabrica fabrica = new Fabrica();

    public void agregarComputadora(String procesador, String tarjetaGrafica, int ram){
        Computadora computadora = fabrica.creaComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
        System.out.println("Se hizo la orden !!");
    }
}