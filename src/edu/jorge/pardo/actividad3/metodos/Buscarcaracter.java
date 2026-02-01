package edu.jorge.pardo.actividad3.metodos;

public class Buscarcaracter {

    public int ejecutar(String texto, char caracter) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                return i;
            }
        }
        return -1;
    }
}
