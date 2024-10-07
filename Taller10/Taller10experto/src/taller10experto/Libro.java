/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10experto;

/**
 *
 * @author alzat
 */
public class Libro {
    private String nombre;
    private String autor;
    private String identificador;
    private double precio;
    private int cantidad;

    public Libro(String nombre, String autor, String isbn, double precio, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.identificador = identificador;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return identificador;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}