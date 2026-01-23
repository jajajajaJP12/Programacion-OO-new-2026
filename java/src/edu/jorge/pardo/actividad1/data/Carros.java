package edu.jorge.pardo.actividad1.data;

public class Carros {
    private final String id;
    private final String marca;
    private final String modelo;
    private final String version;
    private final int anio;

    private final String tipo;
    private final String traccion;
    private final String plataforma;

    private final String autonomia;
    private final String aceleracion;
    private final String velMax;
    private final String bateria;
    private final String potencia;
    private final String torque;

    private final String dimensiones;
    private final String distanciaEjes;
    private final String cajuela;
    private final String extraCajuela;
    private final String rines;

    public Carros(
            String id,
            String marca,
            String modelo,
            String version,
            int anio,
            String tipo,
            String traccion,
            String plataforma,
            String autonomia,
            String aceleracion,
            String velMax,
            String bateria,
            String potencia,
            String torque,
            String dimensiones,
            String distanciaEjes,
            String cajuela,
            String extraCajuela,
            String rines
    ) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.version = version;
        this.anio = anio;

        this.tipo = tipo;
        this.traccion = traccion;
        this.plataforma = plataforma;

        this.autonomia = autonomia;
        this.aceleracion = aceleracion;
        this.velMax = velMax;
        this.bateria = bateria;
        this.potencia = potencia;
        this.torque = torque;

        this.dimensiones = dimensiones;
        this.distanciaEjes = distanciaEjes;
        this.cajuela = cajuela;
        this.extraCajuela = extraCajuela;
        this.rines = rines;
    }

    public String getId() { return id; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getVersion() { return version; }
    public int getAnio() { return anio; }

    public String nombreCorto() {
        return marca + " " + modelo + " " + version + " " + anio;
    }

    public String detalleCompleto() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n");
        sb.append("Vehículo: ").append(nombreCorto()).append("\n");
        sb.append("Tipo: ").append(tipo).append(" | Tracción: ").append(traccion).append("\n");

        if (plataforma != null && !plataforma.isBlank()) {
            sb.append("Plataforma: ").append(plataforma).append("\n");
        }

        sb.append("Autonomía: ").append(autonomia).append("\n");
        if (aceleracion != null && !aceleracion.isBlank()) sb.append("0–100 km/h: ").append(aceleracion).append("\n");
        if (velMax != null && !velMax.isBlank()) sb.append("Velocidad máx: ").append(velMax).append("\n");
        if (bateria != null && !bateria.isBlank()) sb.append("Batería: ").append(bateria).append("\n");
        if (potencia != null && !potencia.isBlank()) sb.append("Potencia: ").append(potencia).append("\n");
        if (torque != null && !torque.isBlank()) sb.append("Torque: ").append(torque).append("\n");

        sb.append("Dimensiones (mm): ").append(dimensiones).append("\n");
        sb.append("Distancia entre ejes (mm): ").append(distanciaEjes).append("\n");
        sb.append("Cajuela: ").append(cajuela).append("\n");
        if (extraCajuela != null && !extraCajuela.isBlank()) sb.append("Extra: ").append(extraCajuela).append("\n");
        if (rines != null && !rines.isBlank()) sb.append("Rines: ").append(rines).append("\n");

        return sb.toString();
    }
}