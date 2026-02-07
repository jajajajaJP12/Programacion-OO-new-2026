package edu.jorge.pardo.V2.process;

import edu.jorge.pardo.actividad2.process.Multiplicacion;
import edu.jorge.pardo.actividad2.process.Suma;

public class Potencia extends Multiplicacion{

    public static int realizarOperacion(int base, int exponente) {
        if (exponente < 0) throw new IllegalArgumentException("Exponente negativo no soportado (solo enteros).");

        int resultado = 1;
        for (int i = 0; i < exponente; i = Suma.realizarOperacion(i, 1)) {
            resultado = Multiplicacion.realizarOperacion(resultado, base);
        }
        return resultado;
    }
}