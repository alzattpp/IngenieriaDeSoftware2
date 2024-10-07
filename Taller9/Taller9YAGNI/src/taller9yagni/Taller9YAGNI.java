/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller9yagni;

import java.util.ArrayList;
import java.util.List;

public class Taller9YAGNI {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro("El Renacuajo paseador", "Rafael Pombo", 1867);

        biblioteca.agregarLibro(libro);

        biblioteca.getLibros().forEach(l -> 
            System.out.println("Titulo: " + l.getTitulo() + ", Autor: " + l.getAutor() + ", Año: " + l.getAñoPublicacion())
        );
    }
}

