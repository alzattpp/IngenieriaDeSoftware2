/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10controlador;

/**
 *
 * @author alzat
 */
import java.util.ArrayList;
import java.util.List;

public class ventaControlador {
    private List<Entrada> entradas = new ArrayList<>();

    public void agregarEntrada(Entrada entrada){
        entradas.add(entrada);
        System.out.println("Se agrego correctamente la entrada");
    }

    public void comprarEntrada(String tipoEntrada){
        Entrada entrada = encontrarEntrada(tipoEntrada);
        if(entrada.isDisponibilidad()){
            entrada.setDisponibilidad(false);
            System.out.println("Su entrada no fue comprada");
        } else {
            System.out.println("Su entrada no se encuentra disponible.");
        }
    }

    private Entrada encontrarEntrada(String tipoEntrada){
        for (Entrada entrada : entradas){
            System.out.println(entrada.getTipo());
            if(entrada.getTipo().equals(tipoEntrada)){
                return entrada;
            }
        }
        return new Entrada(null, 0, false);
    }
}