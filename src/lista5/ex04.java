package lista5;

public class ex04 {
    private double valorHora = 0;
    private double horasMes = 0;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(double horasMes) {
        this.horasMes = horasMes;
    }

    public double salarioBruto() {
        return valorHora * horasMes;
    }

    public double descontoIR() {
        return salarioBruto() * 0.11;
    }

    public double descontoINSS() {
        return salarioBruto() * 0.08;
    }

    public double descontoSindicato() {
        return salarioBruto() * 0.05;
    }

    public double totalDescontos() {
        return descontoIR() + descontoINSS() + descontoSindicato();
    }

    public double salarioLiquido() {
        return salarioBruto() - totalDescontos();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("+ Salário Bruto : R$ ");
        builder.append(salarioBruto());
        builder.append("\n- IR (11%) : R$ ");
        builder.append(descontoIR());
        builder.append("\n- INSS (8%) : R$ ");
        builder.append(descontoINSS());
        builder.append("\n- Sindicato (5%) : R$ ");
        builder.append(descontoSindicato());
        builder.append("\n= Salário Líquido : R$ ");
        builder.append(salarioLiquido());
        return builder.toString();
    }
}
