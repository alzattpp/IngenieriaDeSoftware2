/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller11FabricacionPura;
import java.util.List;
import java.util.ArrayList;

public class Taller11FabricacionPura {
    public static void main(String[] args) {
        FabricaPedidos fabrica = new FabricaPedidos();
        Cliente cliente = fabrica.crearCliente("Sergio Alzate", "Calle 12112");

        List<Producto> productos = new ArrayList<>();
        productos.add(fabrica.crearProducto("Cafetera", 130000, 1));
        productos.add(fabrica.crearProducto("Libro", 50000, 2));
        productos.add(fabrica.crearProducto("Cuadro decorativo", 60000, 1));

        Pedido pedido = fabrica.crearPedido(cliente, productos);
        System.out.println("Pedido a nombre de "+pedido.getCliente().getNombre()+" creado");
    }
}