package edu.jorge.pardo.actividad3.metodos;

import java.util.List;

public class Mayorsalariomayores30 {

    public Empleado ejecutar(List<Empleado> empleados) {
        Empleado mayor = null;

        for (Empleado e : empleados) {
            if (e.getEdad() > 30) {
                if (mayor == null || e.getSalario() > mayor.getSalario()) {
                    mayor = e;
                }
            }
        }

        return mayor;
    }
}
