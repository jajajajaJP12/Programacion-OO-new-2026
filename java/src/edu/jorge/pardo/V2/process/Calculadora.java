package edu.jorge.pardo.V2.process;

import edu.jorge.pardo.actividad2.process.*;
import edu.jorge.pardo.actividad2.process.Modulo;

public class Calculadora {

    public Operacion operacion;

    public void setOperacion(int opcion) { this.operacion = getOperacion(opcion); }

    private Operacion getOperacion(int opcion){
        return switch(opcion){
            case 1 -> new Suma();
            case 2 -> new Resta();
            case 3 -> new Multiplicacion();
            case 4 -> new Potencia();
            case 5 -> new Division();
            case 6 -> new Logaritmo();
            case 7 -> new Modulo();
            case 8 -> new RaizCuadrada();
            default -> throw new IllegalArgumentException("opcion invalida intente de nuevo" + opcion);
        };
    }
}