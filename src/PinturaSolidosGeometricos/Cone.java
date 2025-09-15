package PinturaSolidosGeometricos;

public class Cone {
    // Constantes
    public static final double PI = 3.14;
    public static final double RENDIMENTO = 3.45; // m² por litro
    public static final double LL = 18.0;
    public static final double[] preco_tipo = {238.90, 467.98, 758.34};

    // Atributos
    private double raio;
    private double altura;
    private int tipoTinta; // 1, 2 ou 3
    private int exemplo;   // número do exemplo

    // Construtores
    public Cone() {
        this.raio = 0;
        this.altura = 0;
        this.tipoTinta = 1;
        this.exemplo = 0;
    }

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
        this.tipoTinta = 1;
        this.exemplo = 0;
    }

    public Cone(double raio, double altura, int tipoTinta) {
        this.raio = raio;
        this.altura = altura;
        this.tipoTinta = tipoTinta;
        this.exemplo = 0;
    }

    public Cone(double raio, double altura, int tipoTinta, int exemplo) {
        this.raio = raio;
        this.altura = altura;
        this.tipoTinta = tipoTinta;
        this.exemplo = exemplo;
    }

    // Get e Set
    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public int getTipoTinta() { return tipoTinta; }
    public void setTipoTinta(int tipoTinta) { this.tipoTinta = tipoTinta; }

    public int getExemplo() { return exemplo; }
    public void setExemplo(int exemplo) { this.exemplo = exemplo; }

    // Métodos
    public double getGeratriz() {
        return Math.sqrt((raio * raio) + (altura * altura));
    }

    public double getAreaFundo() {
        return PI * raio * raio;
    }

    public double getAreaLateral() {
        return PI * raio * getGeratriz();
    }

    public double getAreaTotal() {
        return getAreaFundo() + getAreaLateral();
    }

    public double getLitros() {
        return getAreaTotal() / RENDIMENTO;
    }

    public int getLatas() {
        return (int) Math.ceil(getLitros() / LL);
    }

    public double getPrecoTotal() {
        return getLatas() * preco_tipo[tipoTinta - 1];
    }

    @Override
    public String toString() {
        return "— Exemplo " + exemplo + " —\n" +
                "— Cone —\n" +
                "Raio: " + raio + "\n" +
                "Altura: " + altura + "\n" +
                "Nível: " + tipoTinta + "\n" +
                "——————————————\n" +
                "Geratriz: " + getGeratriz() + "\n" +
                "——————————————\n" +
                "Área do Fundo: " + getAreaFundo() + "\n" +
                "Área Lateral Cone: " + getAreaLateral() + "\n" +
                "Área Total: " + getAreaTotal() + "\n" +
                "——————————————\n" +
                "Litros: " + getLitros() + "\n" +
                "Latas: " + getLatas() + "\n" +
                "——————————————\n" +
                "Preço Total: " + getPrecoTotal() + "\n";
    }
}
