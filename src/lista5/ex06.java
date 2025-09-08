package lista5;

public class ex06 {
    private double lado = 1;

    public void mudarValorLado(double novoLado) {
        if (novoLado > 0) {
            this.lado = novoLado;
        }
    }

    public double retornarValorLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Quadrado [lado=");
        builder.append(lado);
        builder.append(", area=");
        builder.append(calcularArea());
        builder.append("]");
        return builder.toString();
    }
}
