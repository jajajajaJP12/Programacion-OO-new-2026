package edu.jorge.pardo.actividad1.data;

import java.util.HashMap;
import java.util.Map;

public class Precios {
    private final Map<String, Double> preciosPorId = new HashMap<>();

    public Precios() {
        // MXN - AJUSTA SEGUN TU FUENTE
        preciosPorId.put("S7-AWD", 999_900.00);
        preciosPorId.put("DM-STD", 359_900.00);
        preciosPorId.put("DM-PLUS", 399_900.00);
        preciosPorId.put("YPRO", 529_900.00);
        preciosPorId.put("SEAL-RWD", 789_900.00);
        preciosPorId.put("SEAL-AWD", 899_900.00);
    }

    public double obtenerPrecio(String idCarro) {
        Double p = preciosPorId.get(idCarro.toUpperCase());
        return (p == null) ? -1.0 : p;
    }
}