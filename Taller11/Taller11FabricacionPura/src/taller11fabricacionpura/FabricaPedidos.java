/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11FabricacionPura;

import java.util.List;

public class FabricaPedidos {

    public Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        System.out.println("Pedido creado...");
        return new Pedido(cliente, productos);
    }

    public Producto crearProducto(String nombre, double precio, int cantidad) {
        return new Producto(nombre, precio, cantidad);
    }

    public Cliente crearCliente(String nombre, String direccion) {
        return new Cliente(nombre, direccion);
    }
}
