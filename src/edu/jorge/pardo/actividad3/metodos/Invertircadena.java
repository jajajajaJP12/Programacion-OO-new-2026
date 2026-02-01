package edu.jorge.pardo.actividad3.metodos;

public class Invertircadena {

    public String ejecutar(String texto) {
        char[] letras = texto.toCharArray();
        int inicio = 0;
        int fin = letras.length - 1;

        while (inicio < fin) {
            char temp = letras[inicio];
            letras[inicio] = letras[fin];
            letras[fin] = temp;
            inicio++;
            fin--;
        }
        return new String(letras);
    }
}
