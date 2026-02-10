package edu.jorge.pardo.V2.process;

public class Multiplicacion extends Suma {
    @Override
    public int apply(int a, int b) {
        int producto = 0;
        for (int i = 0; i < b; i++) {
            producto = super.apply(producto, a); // suma repetida
        }
        return producto;
    }
}
