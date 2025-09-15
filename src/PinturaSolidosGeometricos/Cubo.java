package PinturaSolidosGeometricos;

public class Cubo {
    // Constantes
    public static final double litros_lata = 18.0;
    public static final double[] preco_tipo = {101.90, 212.45, 345.56};

    // Atributos
    private double lado;
    private double rendimento; // m² por litro
    private int tipoTinta; // 1, 2 ou 3
    private int exemplo; // número do exemplo

    // Construtores
    public Cubo() {
        this.lado = 0;
        this.rendimento = 1;
        this.tipoTinta = 1;
        this.exemplo = 0;
    }

    public Cubo(double lado, double rendimento) {
        this.lado = lado;
        this.rendimento = rendimento;
        this.tipoTinta = 1;
        this.exemplo = 0;
    }

    public Cubo(double lado, double rendimento, int tipoTinta) {
        this.lado = lado;
        this.rendimento = rendimento;
        this.tipoTinta = tipoTinta;
        this.exemplo = 0;
    }

    // Construtor com número do exemplo
    public Cubo(double lado, double rendimento, int tipoTinta, int exemplo) {
        this.lado = lado;
        this.rendimento = rendimento;
        this.tipoTinta = tipoTinta;
        this.exemplo = exemplo;
    }

    // Getters e Setters (mantive os nomes)
    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }

    public double getRendimento() { return rendimento; }
    public void setRendimento(double rendimento) { this.rendimento = rendimento; }

    public int getTipoTinta() { return tipoTinta; }
    public void setTipoTinta(int tipoTinta) { this.tipoTinta = tipoTinta; }

    public int getExemplo() { return exemplo; }
    public void setExemplo(int exemplo) { this.exemplo = exemplo; }

    // Métodos de cálculo
    public double getAreaBase() {
        return lado * lado;
    }

    public double getAreaTotal() {
        return 6 * getAreaBase();
    }

    public double getVolume() {
        return lado * lado * lado;
    }

    public double getDiagonal() {
        return lado * Math.sqrt(3);
    }

    public double getLitros() {
        return getAreaTotal() / rendimento;
    }

    public int getLatas() {
        return (int) Math.ceil(getLitros() / litros_lata);
    }

    public double getPrecoTotal() {
        return getLatas() * preco_tipo[tipoTinta - 1];
    }

    @Override
    public String toString() {
        return "— Exemplo " + exemplo + " —\n" +
                "a : " + lado + "\n" +
                "Rendimento : " + rendimento + "\n" +
                "Tipo de Tinta : " + tipoTinta + "\n" +
                "————————–\n" +
                "Área da Base : " + getAreaBase() + "\n" +
                "Área Total : " + getAreaTotal() + "\n" +
                "Volume : " + getVolume() + "\n" +
                "Diagonal do Cubo : " + getDiagonal() + "\n" +
                "Litros de Tinta: " + getLitros() + "\n" +
                "Latas de Tinta: " + getLatas() + "\n" +
                "Valor Total: " + getPrecoTotal() + "\n";
    }
}
