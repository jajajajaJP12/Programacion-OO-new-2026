package edu.jorge.pardo.actividad3.metodos;

import java.util.List;

public class Contardepartamentosistemas {

    public int ejecutar(List<Empleado> empleados) {
        int contador = 0;

        for (Empleado e : empleados) {
            if (e.getDepartamento().equalsIgnoreCase("sistemas")) {
                contador++;
            }
        }
        return contador;
    }
}
