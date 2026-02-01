package edu.jorge.pardo.actividad3.test;

import edu.jorge.pardo.actividad3.metodos.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmpleadosTest {

    private List<Empleado> empleadosDemo() {
        return List.of(
                new Empleado("Ana", 22, 18000, "Sistemas"),
                new Empleado("Luis", 31, 32000, "Ventas"),
                new Empleado("Karla", 31, 28000, "Sistemas"),
                new Empleado("Diego", 28, 26000, "Sistemas"),
                new Empleado("Marta", 40, 50000, "RH"),
                new Empleado("Paco", 22, 15000, "Ventas")
        );
    }

    @Test
    void mayorSalario_ok() {
        Mayorsalario m = new Mayorsalario();
        assertEquals("Marta", m.ejecutar(empleadosDemo()).getNombre());
    }

    @Test
    void edadMasComun_ok() {
        Edadmascomun e = new Edadmascomun();
        // 22 aparece 2 veces y 31 aparece 2 veces; criterio típico: menor edad -> 22
        assertEquals(22, e.ejecutar(empleadosDemo()));
    }

    @Test
    void promedioEdad_ok() {
        Promedioedad p = new Promedioedad();
        double esperado = (22 + 31 + 31 + 28 + 40 + 22) / 6.0;
        assertEquals(esperado, p.ejecutar(empleadosDemo()), 0.0001);
    }

    @Test
    void promedioSalario_ok() {
        Promediosalario p = new Promediosalario();
        double esperado = (18000 + 32000 + 28000 + 26000 + 50000 + 15000) / 6.0;
        assertEquals(esperado, p.ejecutar(empleadosDemo()), 0.0001);
    }

    @Test
    void contarMayores25k_ok() {
        Contarmayores25k c = new Contarmayores25k();
        assertEquals(4, c.ejecutar(empleadosDemo()));
    }

    @Test
    void menoresDe25_ok() {
        Menoresde25 m = new Menoresde25();
        assertEquals(2, m.ejecutar(empleadosDemo()).size());
    }

    @Test
    void contarDepartamentoSistemas_ok() {
        Contardepartamentosistemas c = new Contardepartamentosistemas();
        assertEquals(3, c.ejecutar(empleadosDemo()));
    }

    @Test
    void mayorSalarioMayores30_ok() {
        Mayorsalariomayores30 m = new Mayorsalariomayores30();
        assertEquals("Marta", m.ejecutar(empleadosDemo()).getNombre());
    }

    @Test
    void menorSalarioEdadMenosComun_ok() {
        Menorsalarioedadmenoscomun m = new Menorsalarioedadmenoscomun();
        Empleado r = m.ejecutar(empleadosDemo());
        assertNotNull(r);

        // En esta lista, las edades menos comunes son 28 y 40 (1 vez).
        // Muchas implementaciones eligen una de ellas; validamos que regrese alguno de esos casos.
        assertTrue(r.getEdad() == 28 || r.getEdad() == 40);
    }
}
