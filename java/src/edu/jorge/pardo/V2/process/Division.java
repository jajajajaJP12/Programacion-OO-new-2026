package edu.jorge.pardo.V2.process;

public class Division extends Operacion {
    @Override
    public int apply(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir entre 0");
        return a / b;
    }
}
