/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller10experto;

/**
 *
 * @author alzat
 */
public class Taller10experto {
    public static void main(String[] args) {
        Carro Carro = new Carro();
        Libro libro = new Libro("Harry Potter y el prisionero de Azkaban", "J. K. Rowling", null, 50000, 5);        
        Carro.agregarLibro(libro);
        double precioTotal = Carro.calcularPrecioTotal();
        System.out.println("El Total de su compra es de: "+precioTotal);
    }
}
