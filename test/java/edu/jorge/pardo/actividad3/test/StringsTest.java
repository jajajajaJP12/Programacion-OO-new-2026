package edu.jorge.pardo.actividad3.test;

import edu.jorge.pardo.actividad3.metodos.Buscarcaracter;
import edu.jorge.pardo.actividad3.metodos.Contarvocales;
import edu.jorge.pardo.actividad3.metodos.Espalindromo;
import edu.jorge.pardo.actividad3.metodos.Invertircadena;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringsTest {

    @Test
    void esPalindromo_false() {
        Espalindromo p = new Espalindromo();
        assertFalse(p.ejecutar("hola mundo"));
    }

    @Test
    void esPalindromo_true() {
        Espalindromo p = new Espalindromo();
        assertTrue(p.ejecutar("ana"));
    }

    @Test
    void contarVocales_example() {
        Contarvocales v = new Contarvocales();
        assertEquals(2, v.ejecutar("hola"));
    }

    @Test
    void invertirCadena_example() {
        Invertircadena inv = new Invertircadena();
        assertEquals("aloh", inv.ejecutar("hola"));
    }

    @Test
    void buscarCaracter_found() {
        Buscarcaracter b = new Buscarcaracter();
        assertEquals(1, b.ejecutar("hola", 'o'));
    }

    @Test
    void buscarCaracter_notFound() {
        Buscarcaracter b = new Buscarcaracter();
        assertEquals(-1, b.ejecutar("hola", 'r'));
    }
}
