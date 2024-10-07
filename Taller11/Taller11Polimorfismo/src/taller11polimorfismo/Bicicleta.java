/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11polimorfismo;

public class Bicicleta implements Transporte {
    
    @Override
    public void acelerar() {
        System.out.println("Pedalear Bici");
    }

    @Override
    public void frenar() {
        System.out.println("Apretar Frenos Bici");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bicicleta de montaña");
    }
}
