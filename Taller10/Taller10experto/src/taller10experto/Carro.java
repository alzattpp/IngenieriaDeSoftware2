/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10experto;

/**
 *
 * @author alzat
 */
import java.util.ArrayList;
import java.util.List;

public class Carro{

    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El Libro de su seleccion se agrego al carrito");
    }

    public double calcularPrecioTotal(){
        double total = 0;
        for(Libro libro : libros){
            total+= libro.getPrecio() * libro.getCantidad();
        }

        return total;
    }
}