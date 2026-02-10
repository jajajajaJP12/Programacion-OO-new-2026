package edu.jorge.pardo.V2.process;

public class RaizCuadrada extends Operacion {
    @Override
    public int apply(int a, int b) {
        if (a < 0) throw new ArithmeticException("No existe raíz real de un negativo");
        return (int) Math.sqrt(a);
    }
}
