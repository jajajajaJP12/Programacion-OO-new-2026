package edu.jorge.pardo.V2.process;

import edu.jorge.pardo.actividad2.process.Resta;
import edu.jorge.pardo.actividad2.process.Suma;

public class Multiplicacion extends Suma{

    public static int realizarOperacion(int a, int b) {
        if (a == 0 || b == 0) return 0;

        boolean negativo = false;
        if (a < 0) { a = edu.jorge.pardo.actividad2.process.Resta.realizarOperacion(0, a); negativo = !negativo; }
        if (b < 0) { b = edu.jorge.pardo.actividad2.process.Resta.realizarOperacion(0, b); negativo = !negativo; }

        int resultado = 0;
        for (int i = 0; i < b; i = edu.jorge.pardo.actividad2.process.Suma.realizarOperacion(i, 1)) {
            resultado = Suma.realizarOperacion(resultado, a);
        }

        return negativo ? Resta.realizarOperacion(0, resultado) : resultado;
    }
}