package taller14asersion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class EstudianteTest {
    
    private static Estudiante estudiante;

    @BeforeAll
    static void setUp() {
        estudiante = new Estudiante("Juan", 20);
    }

    @AfterAll
    static void tearDown() {
        estudiante = null; 
    }

    @Test
    void agregarCalificacionTest() {
        estudiante.agregarCalificacion(8.5);
        assertEquals(1, estudiante.getNumeroCalificaciones(), "La cantidad de calificaciones debe ser 1");
    }

    @Test
    void obtenerPromedioTest() {
        estudiante.agregarCalificacion(9.0);
        estudiante.agregarCalificacion(7.0);
        assertEquals(8.0, estudiante.obtenerPromedio(), "El promedio debe ser 8.0");
    }

    @Test
    void getNumeroCalificacionesTest() {
        estudiante.agregarCalificacion(6.0);
        estudiante.agregarCalificacion(9.5);
        assertEquals(4, estudiante.getNumeroCalificaciones(), "El número de calificaciones debe ser 4");
    }

    @Test
    void agregarCalificacionExcepcionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(12);
        });
        assertEquals("La calificación debe estar entre 0 y 10.", exception.getMessage());
    }
}