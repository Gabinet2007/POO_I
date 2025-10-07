package lista8.CMP;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;

    // Relações
    private Pessoa dono; // Agregação
    private Motor motor; // Composição

    public Carro(String fabricante, String modelo, String cor, int ano, Pessoa dono, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.dono = dono;
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Carro ===\n")
                .append("Fabricante: ").append(fabricante)
                .append(" | Modelo: ").append(modelo)
                .append(" | Cor: ").append(cor)
                .append(" | Ano: ").append(ano).append("\n")
                .append(dono.toString()).append("\n")
                .append(motor.toString());
        return sb.toString();
    }
}
