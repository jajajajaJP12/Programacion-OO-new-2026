package edu.jorge.pardo.actividad1.ui;

import edu.jorge.pardo.actividad1.data.Catalogo;
import edu.jorge.pardo.actividad1.data.Precios;
import edu.jorge.pardo.actividad1.process.ShopManager;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Precios precios = new Precios();
        ShopManager shop = new ShopManager(catalogo, precios);

        CLI cli = new CLI(shop);
        cli.iniciar();
    }
}