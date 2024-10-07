/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11polimorfismo;

public class Coche implements Transporte {
    @Override
    public void acelerar() {
        System.out.println("Acelerar el coche.");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar el coche.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Dodge Challenger SRT.");
    }
}
