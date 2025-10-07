package lista8.CMP;

public class Motor {
    private String marca;
    private float potencia;
    private int cilindros;
    private String combustivel;

    public Motor(String marca, float potencia, int cilindros, String combustivel) {
        this.marca = marca;
        this.potencia = potencia;
        this.cilindros = cilindros;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor - Marca: ").append(marca)
                .append(" | Potência: ").append(potencia).append("cv")
                .append(" | Cilindros: ").append(cilindros)
                .append(" | Combustível: ").append(combustivel);
        return sb.toString();
    }
}

