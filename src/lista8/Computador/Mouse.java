package lista8.Computador;

public class Mouse {
    private String marca;
    private String tipo;

    public Mouse(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse - Marca: ").append(marca)
                .append(" | Tipo: ").append(tipo);
        return sb.toString();
    }
}

