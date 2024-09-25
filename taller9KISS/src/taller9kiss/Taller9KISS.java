package taller9kiss;

import java.util.Arrays;

public class Taller9KISS {

    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static int encontrarMayor(int[] numeros) {
        return Arrays.stream(numeros).max().getAsInt();
    }

    public static void main(String[] args) {
        
        String cadena = "INGENIERIA DE SOFTWARE 2";
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);

        
        int[] numeros = {2, 4, 26, 1, 12, 55};
        int mayor = encontrarMayor(numeros);
        System.out.println("El numero mayor es: " + mayor);
    }
}
