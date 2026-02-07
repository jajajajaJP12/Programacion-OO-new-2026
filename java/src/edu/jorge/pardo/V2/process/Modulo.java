package edu.jorge.pardo.V2.process;

import edu.jorge.pardo.actividad2.process.Division;
import edu.jorge.pardo.actividad2.process.Multiplicacion;
import edu.jorge.pardo.actividad2.process.Resta;

public class Modulo {

    public static int realizarOperacion(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede calcular módulo con divisor 0.");

        int div = Division.realizarOperacion(a, b);
        int mult = Multiplicacion.realizarOperacion(div, b);
        return Resta.realizarOperacion(a, mult);
    }
}