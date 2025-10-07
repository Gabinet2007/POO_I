package lista8.Computador;

public class Memoria {
    private String marca;
    private String modelo;
    private float capacidade;
    private float velocidade;

    public Memoria(String marca, String modelo, float capacidade, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Memória - Marca: ").append(marca)
                .append(" | Modelo: ").append(modelo)
                .append(" | Capacidade: ").append(capacidade).append("GB")
                .append(" | Velocidade: ").append(velocidade).append("MHz");
        return sb.toString();
    }
}

