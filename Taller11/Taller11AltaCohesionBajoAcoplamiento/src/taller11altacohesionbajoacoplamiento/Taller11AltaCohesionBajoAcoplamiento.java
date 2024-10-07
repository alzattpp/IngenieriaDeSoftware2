/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller11altacohesionbajoacoplamiento;

public class Taller11AltaCohesionBajoAcoplamiento {
    public static void main(String[] args) {
        Item item1 = new Item("Monitor", 1200000, "Monitor 4K UHD");
        Item item2 = new Item("Teclado", 250000, "Teclado mecánico RGB");

        RepositorioItem almacenamiento = new RepositorioItem();
        almacenamiento.guardarEnBaseDeDatos(item1);
        almacenamiento.guardarEnBaseDeDatos(item2);

        Carro carro = new Carro();
        carro.agregarItem(item1);
        carro.agregarItem(item2);

        double total = carro.calcularCostoTotal();
        System.out.println("El costo total del carro es: $" + total);
    }
}
