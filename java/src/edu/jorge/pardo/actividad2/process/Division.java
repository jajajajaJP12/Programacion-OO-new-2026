package edu.jorge.pardo.actividad2.process;

public class Division {

    public static int realizarOperacion(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir entre 0.");

        if (a == 0) return 0;

        boolean negativo = false;
        if (a < 0) { a = Resta.realizarOperacion(0, a); negativo = !negativo; }
        if (b < 0) { b = Resta.realizarOperacion(0, b); negativo = !negativo; }

        int cociente = 0;
        int restante = a;

        while (restante >= b) {
            restante = Resta.realizarOperacion(restante, b);
            cociente = Suma.realizarOperacion(cociente, 1);
        }

        return negativo ? Resta.realizarOperacion(0, cociente) : cociente;
    }
}