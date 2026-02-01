package edu.jorge.pardo.actividad3.metodos;

public class Espalindromo {

    public boolean ejecutar(String texto) {
        texto = texto.replace(" ", "").toLowerCase();
        int inicio = 0;
        int fin = texto.length() - 1;

        while (inicio < fin) {
            if (texto.charAt(inicio) != texto.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }
}
