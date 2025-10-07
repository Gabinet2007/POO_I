package lista8.Computador;

public class Teclado {
    private String marca;
    private String tipo;

    public Teclado(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado - Marca: ").append(marca)
                .append(" | Tipo: ").append(tipo);
        return sb.toString();
    }
}

