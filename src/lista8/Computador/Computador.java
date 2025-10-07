package lista8.Computador;

public class Computador extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private Gabinete gabinete;
    private Teclado teclado;
    private Mouse mouse;
    private Monitor monitor;

    public Computador(float tensao, float consumo, String marca, String modelo,
                      Gabinete gabinete, Teclado teclado, Mouse mouse, Monitor monitor) {
        super(tensao, consumo);
        this.marca = marca;
        this.modelo = modelo;
        this.gabinete = gabinete;
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Computador ===\n")
                .append("Marca: ").append(marca)
                .append(" | Modelo: ").append(modelo).append("\n")
                .append(super.toString()).append("\n\n")
                .append(gabinete.toString()).append("\n\n")
                .append(monitor.toString()).append("\n")
                .append(teclado.toString()).append("\n")
                .append(mouse.toString());
        return sb.toString();
    }
}

