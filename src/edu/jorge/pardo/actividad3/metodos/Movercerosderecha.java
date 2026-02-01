package edu.jorge.pardo.actividad3.metodos;

import java.util.ArrayList;
import java.util.List;

public class Movercerosderecha {

    public List<Integer> ejecutar(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        int ceros = 0;

        for (int n : numeros) {
            if (n == 0) {
                ceros++;
            } else {
                resultado.add(n);
            }
        }

        for (int i = 0; i < ceros; i++) {
            resultado.add(0);
        }

        return resultado;
    }
}
