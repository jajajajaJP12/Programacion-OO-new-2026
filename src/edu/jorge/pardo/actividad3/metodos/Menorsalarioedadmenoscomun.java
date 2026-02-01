package edu.jorge.pardo.actividad3.metodos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menorsalarioedadmenoscomun {

    public Empleado ejecutar(List<Empleado> empleados) {

        // Paso 1: contar edades
        Map<Integer, Integer> conteo = new HashMap<>();
        for (Empleado e : empleados) {
            int edad = e.getEdad();
            conteo.put(edad, conteo.getOrDefault(edad, 0) + 1);
        }

        // Paso 2: encontrar la edad menos común
        int edadMenosComun = Integer.MAX_VALUE;
        int frecuenciaMinima = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            if (entry.getValue() < frecuenciaMinima) {
                frecuenciaMinima = entry.getValue();
                edadMenosComun = entry.getKey();
            }
        }

        // Paso 3: de esa edad, obtener el menor salario
        Empleado menorSalario = null;

        for (Empleado e : empleados) {
            if (e.getEdad() == edadMenosComun) {
                if (menorSalario == null || e.getSalario() < menorSalario.getSalario()) {
                    menorSalario = e;
                }
            }
        }

        return menorSalario;
    }
}
