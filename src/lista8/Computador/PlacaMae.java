package lista8.Computador;

public class PlacaMae {
    private String marca;
    private String modelo;
    private Processador processador;
    private HD hd;
    private Memoria memoria;

    public PlacaMae(String marca, String modelo, Processador processador, HD hd, Memoria memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.hd = hd;
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Placa-Mãe - Marca: ").append(marca)
                .append(" | Modelo: ").append(modelo).append("\n  ")
                .append(processador.toString()).append("\n  ")
                .append(memoria.toString()).append("\n  ")
                .append(hd.toString());
        return sb.toString();
    }
}

