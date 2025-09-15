package PinturaSolidosGeometricos;

public class Piramide {
    // Constantes
    public static final double litros_lata = 18.0;
    public static final double rendimento = 4.76; // m² por litro
    public static final double[] preco_tipo = {127.90, 258.98, 344.34};

    // Atributos
    private double ab;       // aresta da base
    private double h;        // altura
    private int tipoTinta;   // 1, 2 ou 3
    private int exemplo;     // número do exemplo

    // Construtores
    public Piramide() {
        this.ab = 0;
        this.h = 0;
        this.tipoTinta = 1;
        this.exemplo = 0;
    }

    public Piramide(double ab, double h, int tipoTinta) {
        this.ab = ab;
        this.h = h;
        this.tipoTinta = tipoTinta;
        this.exemplo = 0;
    }

    public Piramide(double ab, double h, int tipoTinta, int exemplo) {
        this.ab = ab;
        this.h = h;
        this.tipoTinta = tipoTinta;
        this.exemplo = exemplo;
    }

    // Métodos de cálculo
    public double getA1() {
        return Math.sqrt((ab / 2) * (ab / 2) + h * h);
    }

    public double getAreaTriangulo() {
        return (ab * getA1()) / 2.0;
    }

    public double getAreaBase() {
        return ab * ab;
    }

    public double getAreaTotal() {
        return 4 * getAreaTriangulo() + getAreaBase();
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

    public double getVolume() {
        return (getAreaBase() * h) / 3.0;
    }

    @Override
    public String toString() {
        return "— Exemplo " + exemplo + " —\n" +
                "ab: " + ab + "\n" +
                "h: " + h + "\n" +
                "a1: " + getA1() + "\n" +
                "Área Triângulo: " + getAreaTriangulo() + "\n" +
                "Área Base: " + getAreaBase() + "\n" +
                "Área Total: " + getAreaTotal() + "\n" +
                "Tipo de Tinta: " + tipoTinta + "\n" +
                "Litros: " + getLitros() + "\n" +
                "Latas: " + getLatas() + "\n" +
                "Preço: " + getPrecoTotal() + "\n" +
                "Volume: " + getVolume() + "\n";
    }
}
