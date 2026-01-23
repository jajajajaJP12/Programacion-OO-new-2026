package edu.jorge.pardo.actividad2.process;

public class Potencia {

    public static int realizarOperacion(int base, int exponente) {
        if (exponente < 0) throw new IllegalArgumentException("Exponente negativo no soportado (solo enteros).");

        int resultado = 1;
        for (int i = 0; i < exponente; i = Suma.realizarOperacion(i, 1)) {
            resultado = Multiplicacion.realizarOperacion(resultado, base);
        }
        return resultado;
    }
}