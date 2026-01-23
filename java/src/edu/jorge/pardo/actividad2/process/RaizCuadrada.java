package edu.jorge.pardo.actividad2.process;

public class RaizCuadrada {

    public static int realizarOperacion(int indice, int operando) {
        if (indice != 2) throw new IllegalArgumentException("Solo se admite raíz cuadrada (indice = 2).");
        if (operando < 0) throw new IllegalArgumentException("No se admite raíz de número negativo en enteros.");

        int x = 0;
        while (true) {
            int siguiente = Suma.realizarOperacion(x, 1);
            int pot = Potencia.realizarOperacion(siguiente, 2);

            if (pot > operando) {
                return x; // x es la raíz entera positiva
            }
            x = siguiente;
        }
    }
}