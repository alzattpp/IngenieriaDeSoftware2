/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller11polimorfismo;

public class Taller11Polimorfismo {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Coche coche = new Coche();
        Avion avion = new Avion();
        Bicicleta bicicleta = new Bicicleta();

        garage.estacionar(coche);
        garage.estacionar(avion);
        garage.estacionar(bicicleta);
    }
}
