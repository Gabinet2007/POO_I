package lista5;

public class ex11 {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public ex11(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Abastecido " + litros + " litros");
        } else {
            System.out.println("Quantidade insuficiente na bomba");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= quantidadeCombustivel) {
            double valor = litros * valorLitro;
            quantidadeCombustivel -= litros;
            System.out.println("Valor a pagar: R$ " + valor);
        } else {
            System.out.println("Quantidade insuficiente na bomba");
        }
    }

    public void alterarValor(double novoValor) {
        if (novoValor > 0) {
            this.valorLitro = novoValor;
        }
    }

    public void alterarCombustivel(String novoTipo) {
        if (novoTipo != null && !novoTipo.isEmpty()) {
            this.tipoCombustivel = novoTipo;
        }
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidadeCombustivel = novaQuantidade;
        }
    }

    @Override
    public String toString() {
        return "Bomba [Combustível=" + tipoCombustivel + ", Valor por litro=R$ " + valorLitro + ", Quantidade=" + quantidadeCombustivel + " litros]";
    }
}
