package Prueba;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import Main.Calculadora;

public class PruebaCalculadora {
    private static Calculadora calculadora;

    @BeforeAll
    public static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(10, calculadora.sumar(7, 3)); 
        assertNotEquals(11, calculadora.sumar(7, 3)); 
    }

    @Test
    public void testRestar() {
        assertEquals(5, calculadora.restar(10, 5)); 
    }

    @Test
    public void testMultiplicar() {
        assertEquals(20, calculadora.multiplicar(4, 5)); 
    }

    @Test
    public void testDividir() {
        assertEquals(4, calculadora.dividir(16, 4)); 
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(10, 0));
    }

    @RepeatedTest(5)
    public void testRepetido() {
        assertTrue(calculadora.sumar(3, 2) == 5); 
    }
}
