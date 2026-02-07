package edu.jorge.pardo.V2.process;

import edu.jorge.pardo.actividad2.process.Potencia;
import edu.jorge.pardo.actividad2.process.Suma;

public class Logaritmo extends Division{

    public static int realizarOperacion(int base, int operando) {
        if (base <= 1) throw new IllegalArgumentException("La base debe ser > 1.");
        if (operando <= 0) throw new IllegalArgumentException("El operando debe ser > 0.");

        int x = 0;
        while (true) {
            int pot = Potencia.realizarOperacion(base, x);
            if (pot == operando) return x;
            if (pot > operando) {
                throw new IllegalArgumentException("No existe logaritmo entero exacto para esos valores.");
            }
            x = Suma.realizarOperacion(x, 1);
        }
    }
}