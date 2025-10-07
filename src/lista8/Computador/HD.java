package lista8.Computador;

public class HD {
    private String marca;
    private String modelo;
    private float capacidade;
    private int rpm;

    public HD(String marca, String modelo, float capacidade, int rpm) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HD - Marca: ").append(marca)
                .append(" | Modelo: ").append(modelo)
                .append(" | Capacidade: ").append(capacidade).append("TB")
                .append(" | RPM: ").append(rpm);
        return sb.toString();
    }
}

