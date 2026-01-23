package edu.jorge.pardo.actividad1.process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Ticket {

    public static class Item {
        private final String id;
        private final String marca;
        private final String modelo;
        private final String version;
        private final int anio;
        private final double precio;

        public Item(String id, String marca, String modelo, String version, int anio, double precio) {
            this.id = id;
            this.marca = marca;
            this.modelo = modelo;
            this.version = version;
            this.anio = anio;
            this.precio = precio;
        }

        public String getId() { return id; }
        public double getPrecio() { return precio; }

        public String nombreCompleto() {
            return marca + " " + modelo + " " + version + " " + anio;
        }
    }

    private final String cliente;
    private final List<Item> items;
    private final double total;
    private final LocalDateTime fecha;

    public Ticket(String cliente, List<Item> items, double total) {
        this.cliente = cliente;
        this.items = items;
        this.total = total;
        this.fecha = LocalDateTime.now();
    }

    public String imprimir() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        StringBuilder sb = new StringBuilder();
        sb.append("===============================================\n");
        sb.append("                TICKET DE VENTA                \n");
        sb.append("===============================================\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Fecha:   ").append(fecha.format(fmt)).append("\n");
        sb.append("-----------------------------------------------\n");
        sb.append(String.format("%-10s %-28s %12s%n", "ID", "Vehículo", "Precio"));
        sb.append("-----------------------------------------------\n");

        if (items == null || items.isEmpty()) {
            sb.append("No se agregaron vehículos.\n");
        } else {
            for (Item it : items) {
                sb.append(String.format(
                        "%-10s %-28s %12s%n",
                        it.getId(),
                        recortar(it.nombreCompleto(), 28),
                        "$" + String.format("%,.2f", it.getPrecio())
                ));
            }
        }

        sb.append("-----------------------------------------------\n");
        sb.append("TOTAL A PAGAR: $").append(String.format("%,.2f", total)).append("\n");
        sb.append("===============================================\n");
        return sb.toString();
    }

    private static String recortar(String s, int max) {
        if (s == null) return "";
        if (s.length() <= max) return s;
        return s.substring(0, Math.max(0, max - 3)) + "...";
    }
}