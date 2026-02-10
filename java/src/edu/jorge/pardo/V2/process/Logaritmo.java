package edu.jorge.pardo.V2.process;

public class Logaritmo extends Operacion {
    @Override
    public int apply(int a, int b) {
        if (a <= 0 || a == 1) throw new ArithmeticException("Base inválida (debe ser >0 y !=1)");
        if (b <= 0) throw new ArithmeticException("Número inválido (debe ser >0)");
        return (int) (Math.log(b) / Math.log(a));
    }
}
