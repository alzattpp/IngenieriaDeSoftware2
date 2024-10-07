/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11polimorfismo;

public class Avion implements Transporte {
    @Override
    public void acelerar() {
        System.out.println("Acelerando el avión para despegar.");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar el avion.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avion comercial Airbus A320.");
    }
}
