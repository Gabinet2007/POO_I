package lista8.Computador;

public class Gabinete {
    private String modelo;
    private String tipo;
    private int baias;
    private PlacaMae placaMae;

    public Gabinete(String modelo, String tipo, int baias, PlacaMae placaMae) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.baias = baias;
        this.placaMae = placaMae;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gabinete - Modelo: ").append(modelo)
                .append(" | Tipo: ").append(tipo)
                .append(" | Baias: ").append(baias).append("\n  ")
                .append(placaMae.toString());
        return sb.toString();
    }
}
