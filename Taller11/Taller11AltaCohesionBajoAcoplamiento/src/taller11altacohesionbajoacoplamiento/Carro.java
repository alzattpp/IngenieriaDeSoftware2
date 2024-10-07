/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11altacohesionbajoacoplamiento;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private List<Item> items = new ArrayList<>();
    private RepositorioItem repositorio = new RepositorioItem();

    public void agregarItem(Item item) {
        items.add(item);
        System.out.println("Item " + item.getNombre() + " agregado al carro.");
    }

    public double calcularCostoTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getCosto();
        }
        return total;
    }
}

