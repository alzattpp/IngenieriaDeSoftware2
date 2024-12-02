/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_singleton;

/**
 *
 * @author alzat
 */
public class main {
    public static void main(String[] args) {
        Settings settings = Settings.getInstance();

        System.out.println("Tema: " + settings.getConfiguracion("theme"));
        System.out.println("Idioma: " + settings.getConfiguracion("language"));

        settings.setConfiguracion("theme", "Claro");
        System.out.println("Tema actualizado: " + settings.getConfiguracion("theme"));
    }
}