package edu.jorge.pardo.V2.process;

public class Potencia extends Multiplicacion {
    @Override
    public int apply(int a, int b) {
        int potencia = 1;
        for (int i = 0; i < b; i++) {
            potencia = super.apply(potencia, a); // multiplicación repetida
        }
        return potencia;
    }
}
