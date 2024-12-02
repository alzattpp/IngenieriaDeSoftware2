/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_builder;

/**
 *
 * @author alzat
 */
public class main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new Hamburguesa.Builder()
                .setTipoTomate("Tomate verde")
                .setTipoCarne("Carne de res")
                .setTipoQueso("Queso amarillo")
                .setTipoPan("Pan de Hamburguesa")
                .build();
        System.out.println(hamburguesa);
    }
}
