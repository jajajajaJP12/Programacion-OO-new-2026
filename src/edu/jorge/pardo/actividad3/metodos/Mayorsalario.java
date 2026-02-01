package edu.jorge.pardo.actividad3.metodos;

import java.util.List;

public class Mayorsalario {

    public Empleado ejecutar(List<Empleado> empleados) {
        Empleado mayor = empleados.get(0);

        for (Empleado e : empleados) {
            if (e.getSalario() > mayor.getSalario()) {
                mayor = e;
            }
        }
        return mayor;
    }
}
