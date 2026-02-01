package edu.jorge.pardo.actividad3.test;

import edu.jorge.pardo.actividad3.metodos.Contarnumerospares;
import edu.jorge.pardo.actividad3.metodos.Movercerosderecha;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EnterosTest {

    @Test
    void moverCerosDerecha_example() {
        Movercerosderecha m = new Movercerosderecha();
        assertEquals(
                List.of(2, 1, 4, 2, 0, 0),
                m.ejecutar(List.of(0, 2, 1, 4, 2, 0))
        );
    }

    @Test
    void contarNumerosPares_example() {
        Contarnumerospares c = new Contarnumerospares();
        assertEquals(2, c.ejecutar(List.of(3, 4, 5, 7, 6)));
    }
}
