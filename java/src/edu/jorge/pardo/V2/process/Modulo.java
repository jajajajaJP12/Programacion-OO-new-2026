package edu.jorge.pardo.V2.process;

public class Modulo extends Division {
    @Override
    public int apply(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede módulo entre 0");
        return a % b;
    }
}
