package edu.jorge.pardo.actividad3.metodos;

import java.util.ArrayList;
import java.util.List;

public class Menoresde25 {

    public List<Empleado> ejecutar(List<Empleado> empleados) {
        List<Empleado> resultado = new ArrayList<>();

        for (Empleado e : empleados) {
            if (e.getEdad() < 25) {
                resultado.add(e);
            }
        }
        return resultado;
    }
}
