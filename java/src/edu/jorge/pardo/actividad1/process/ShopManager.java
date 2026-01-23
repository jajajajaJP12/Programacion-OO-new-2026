package edu.jorge.pardo.actividad1.process;

import edu.jorge.pardo.actividad1.data.Catalogo;
import edu.jorge.pardo.actividad1.data.Carros;
import edu.jorge.pardo.actividad1.data.Precios;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    private final Catalogo catalogo;
    private final Precios precios;

    public ShopManager(Catalogo catalogo, Precios precios) {
        this.catalogo = catalogo;
        this.precios = precios;
    }

    public List<Carros> obtenerCatalogo() {
        return catalogo.listar();
    }

    public Carros buscarCarro(String id) {
        return catalogo.buscarPorId(id);
    }

    public double precioDe(Carros carro) {
        return precios.obtenerPrecio(carro.getId());
    }

    public Ticket generarTicket(String cliente, List<Carros> seleccion) {
        List<Ticket.Item> items = new ArrayList<>();
        double total = 0.0;

        for (Carros c : seleccion) {
            double precio = precioDe(c);

            // Si falta precio, no bloqueamos el programa, pero lo marcamos.
            if (precio < 0) {
                precio = 0.0;
            }

            items.add(new Ticket.Item(
                    c.getId(),
                    c.getMarca(),
                    c.getModelo(),
                    c.getVersion(),
                    c.getAnio(),
                    precio
            ));
            total += precio;
        }

        return new Ticket(cliente, items, total);
    }
}