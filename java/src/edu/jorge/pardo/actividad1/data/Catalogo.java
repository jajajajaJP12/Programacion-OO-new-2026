package edu.jorge.pardo.actividad1.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Catalogo {
    private final List<Carros> inventario;

    public Catalogo() {
        List<Carros> temp = new ArrayList<>();

        // BYD SEALION 7 AWD
        temp.add(new Carros(
                "S7-AWD", "BYD", "SEALION 7", "AWD", 2024,
                "SUV mediano", "AWD",
                "e-Platform 3.0 + Cell-to-Body (CTB)",
                "456 km (WLTC)", "4.5 s", "215 km/h",
                "82.5 kWh",
                "Del 160 kW / Tras 230 kW",
                "310 Nm / 380 Nm",
                "4830 x 1925 x 1620", "2930",
                "500 L", "Frunk 58 L", "20\""
        ));

        // BYD DOLPHIN MINI Estándar
        temp.add(new Carros(
                "DM-STD", "BYD", "DOLPHIN MINI", "Estándar", 2024,
                "Hatchback compacto", "FWD",
                "",
                "300 km (NEDC)", "", "130 km/h",
                "30.08 kWh", "55 kW", "135 Nm",
                "3780 x 1715 x 1580", "2500",
                "230 L", "", "16\""
        ));

        // BYD DOLPHIN MINI Plus
        temp.add(new Carros(
                "DM-PLUS", "BYD", "DOLPHIN MINI", "Plus", 2024,
                "Hatchback compacto", "FWD",
                "",
                "380 km (NEDC)", "", "130 km/h",
                "38.8 kWh", "55 kW", "135 Nm",
                "3780 x 1715 x 1580", "2500",
                "230 L", "", "16\""
        ));

        // BYD YUAN PRO FWD
        temp.add(new Carros(
                "YPRO", "BYD", "YUAN PRO", "FWD", 2024,
                "SUV compacto", "FWD",
                "",
                "380 km (NEDC)", "7.9 s", "",
                "Blade 45 kWh", "130 kW", "290 Nm",
                "4310 x 1830 x 1675", "2620",
                "265 L", "1210 L (asientos abatidos)", "17\""
        ));

        // BYD SEAL RWD
        temp.add(new Carros(
                "SEAL-RWD", "BYD", "SEAL", "RWD", 2024,
                "Sedán deportivo", "RWD",
                "",
                "460 km (WLTC)", "7.5 s", "180 km/h",
                "61.44 kWh", "", "",
                "4800 x 1875 x 1460", "2920",
                "400 L", "Cd 0.219", ""
        ));

        // BYD SEAL AWD
        temp.add(new Carros(
                "SEAL-AWD", "BYD", "SEAL", "AWD", 2024,
                "Sedán deportivo", "AWD",
                "",
                "520 km (WLTC)", "3.8 s", "180 km/h",
                "82.56 kWh", "390 kW (combinada)", "670 Nm (combinado)",
                "4800 x 1875 x 1460", "2920",
                "400 L", "Cd 0.219", ""
        ));

        this.inventario = Collections.unmodifiableList(temp);
    }

    public List<Carros> listar() {
        return inventario;
    }

    public Carros buscarPorId(String id) {
        for (Carros c : inventario) {
            if (c.getId().equalsIgnoreCase(id)) return c;
        }
        return null;
    }
}