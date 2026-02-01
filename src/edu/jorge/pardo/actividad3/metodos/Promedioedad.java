package edu.jorge.pardo.actividad3.metodos;

import java.util.List;

public class Promedioedad {

    public double ejecutar(List<Empleado> empleados) {
        double suma = 0;

        for (Empleado e : empleados) {
            suma += e.getEdad();
        }
        return suma / empleados.size();
    }
}
