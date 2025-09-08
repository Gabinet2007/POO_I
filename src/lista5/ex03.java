package lista5;

public class ex03 {
    private int num1 = 1;
    private int num2 = 2;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int soma() {
        return num1 + num2;
    }

    public int subtracao() {
        return num1 - num2;
    }

    public int multiplicacao() {
        return num1 * num2;
    }

    public double divisao() {
        if (num2 == 0) {
            return Double.NaN;
        }
        return (double) num1 / num2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Números: ");
        builder.append(num1);
        builder.append(" e ");
        builder.append(num2);
        builder.append("\nSoma = ");
        builder.append(soma());
        builder.append("\nSubtração = ");
        builder.append(subtracao());
        builder.append("\nMultiplicação = ");
        builder.append(multiplicacao());
        builder.append("\nDivisão = ");
        if (num2 == 0) {
            builder.append("Erro (divisão por zero)");
        } else {
            builder.append(divisao());
        }
        return builder.toString();
    }
}
