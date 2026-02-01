package edu.jorge.pardo.actividad3.metodos;

import java.util.List;

public class Contarnumerospares {

    public int ejecutar(List<Integer> numeros) {
        int contador = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }
}
