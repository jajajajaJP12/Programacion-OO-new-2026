package edu.jorge.pardo.actividad3.metodos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Edadmascomun {

    public int ejecutar(List<Empleado> empleados) {
        Map<Integer, Integer> conteo = new HashMap<>();

        for (Empleado e : empleados) {
            int edad = e.getEdad();
            conteo.put(edad, conteo.getOrDefault(edad, 0) + 1);
        }

        int edadMasComun = Integer.MAX_VALUE;
        int maxFrecuencia = -1;

        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            int edad = entry.getKey();
            int frecuencia = entry.getValue();

            if (frecuencia > maxFrecuencia || (frecuencia == maxFrecuencia && edad < edadMasComun)) {
                maxFrecuencia = frecuencia;
                edadMasComun = edad;
            }
        }
        return edadMasComun;
    }
}
