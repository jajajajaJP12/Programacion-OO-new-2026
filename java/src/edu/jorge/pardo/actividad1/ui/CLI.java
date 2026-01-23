package edu.jorge.pardo.actividad1.ui;

import edu.jorge.pardo.actividad1.data.Carros;
import edu.jorge.pardo.actividad1.process.ShopManager;
import edu.jorge.pardo.actividad1.process.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {
    private final ShopManager shop;
    private final Scanner sc = new Scanner(System.in);

    public CLI(ShopManager shop) {
        this.shop = shop;
    }

    public void iniciar() {
        System.out.println("=== Venta de Vehículos (CLI) ===\n");

        String cliente = pedirTexto("Nombre del cliente: ");

        System.out.println("\n--- Vehículos en exhibición ---");
        mostrarCatalogo();

        List<Carros> seleccion = new ArrayList<>();

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1) Agregar auto por ID");
            System.out.println("2) Ver selección");
            System.out.println("3) Generar ticket y finalizar");
            System.out.println("4) Salir");

            int op = pedirEnteroRango("Elige una opción: ", 1, 4);

            if (op == 1) {
                String id = pedirTexto("ID del auto (ej: DM-PLUS): ");
                Carros c = shop.buscarCarro(id);

                if (c == null) {
                    System.out.println("No existe un vehículo con ese ID.");
                } else {
                    seleccion.add(c);
                    double precio = shop.precioDe(c);
                    if (precio < 0) {
                        System.out.println("Agregado: " + c.nombreCorto() + " | Precio NO definido (edita Precios.java)");
                    } else {
                        System.out.println("Agregado: " + c.nombreCorto() + " | $" + String.format("%,.2f", precio));
                    }
                }

            } else if (op == 2) {
                mostrarSeleccion(seleccion);

            } else if (op == 3) {
                Ticket t = shop.generarTicket(cliente, seleccion);
                System.out.println("\n" + t.imprimir());
                break;

            } else {
                System.out.println("Salida sin compra. ¡Vuelve pronto!");
                break;
            }
        }
    }

    private void mostrarCatalogo() {
        for (Carros c : shop.obtenerCatalogo()) {
            System.out.println("----------------------------------------");
            System.out.print(c.detalleCompleto());
            double precio = shop.precioDe(c);
            if (precio < 0) {
                System.out.println("Precio: (No definido) -> edita Precios.java");
            } else {
                System.out.println("Precio: $" + String.format("%,.2f", precio));
            }
        }
        System.out.println("----------------------------------------");
    }

    private void mostrarSeleccion(List<Carros> seleccion) {
        if (seleccion.isEmpty()) {
            System.out.println("No has seleccionado vehículos aún.");
            return;
        }

        double subtotal = 0;
        System.out.println("\n=== Selección actual ===");
        for (int i = 0; i < seleccion.size(); i++) {
            Carros c = seleccion.get(i);
            double precio = shop.precioDe(c);
            subtotal += (precio < 0 ? 0 : precio);

            String precioTxt = (precio < 0) ? "(No definido)" : "$" + String.format("%,.2f", precio);
            System.out.println((i + 1) + ") " + c.nombreCorto() + " | " + precioTxt);
        }
        System.out.println("Subtotal: $" + String.format("%,.2f", subtotal));
    }

    private String pedirTexto(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("Entrada inválida. Intenta de nuevo.");
        }
    }

    private int pedirEnteroRango(String msg, int min, int max) {
        while (true) {
            System.out.print(msg);
            String raw = sc.nextLine().trim();
            try {
                int val = Integer.parseInt(raw);
                if (val >= min && val <= max) return val;
            } catch (NumberFormatException ignored) {}
            System.out.println("Opción inválida. Debe ser un número entre " + min + " y " + max + ".");
        }
    }
}