package lista8.Computador;

public class Processador {
    private String marca;
    private String modelo;
    private float clock;
    private float cache;

    public Processador(String marca, String modelo, float clock, float cache) {
        this.marca = marca;
        this.modelo = modelo;
        this.clock = clock;
        this.cache = cache;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Processador - Marca: ").append(marca)
                .append(" | Modelo: ").append(modelo)
                .append(" | Clock: ").append(clock).append("GHz")
                .append(" | Cache: ").append(cache).append("MB");
        return sb.toString();
    }
}

