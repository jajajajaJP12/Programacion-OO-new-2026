package edu.jorge.pardo.actividad2.process;

public class Modulo {

    public static int realizarOperacion(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede calcular módulo con divisor 0.");

        int div = Division.realizarOperacion(a, b);
        int mult = Multiplicacion.realizarOperacion(div, b);
        return Resta.realizarOperacion(a, mult);
    }
}