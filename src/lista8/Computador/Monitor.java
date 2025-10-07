package lista8.Computador;

public class Monitor {
    private String marca;
    private String tipo;
    private String resolucao;

    public Monitor(String marca, String tipo, String resolucao) {
        this.marca = marca;
        this.tipo = tipo;
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor - Marca: ").append(marca)
                .append(" | Tipo: ").append(tipo)
                .append(" | Resolução: ").append(resolucao);
        return sb.toString();
    }
}

