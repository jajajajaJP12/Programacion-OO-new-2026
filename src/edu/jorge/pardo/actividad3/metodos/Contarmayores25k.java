package edu.jorge.pardo.actividad3.metodos;

import java.util.List;

public class Contarmayores25k {

    public int ejecutar(List<Empleado> empleados) {
        int contador = 0;

        for (Empleado e : empleados) {
            if (e.getSalario() > 25000) {
                contador++;
            }
        }
        return contador;
    }
}
