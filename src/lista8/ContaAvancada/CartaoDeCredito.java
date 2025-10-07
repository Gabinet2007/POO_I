package lista8.ContaAvancada;

public class CartaoDeCredito {
    private int numero;
    private String operadora;
    private double limite;
    private String tipoDeCartao;

    public CartaoDeCredito(int numero, String operadora, double limite, String tipoDeCartao) {
        this.numero = numero;
        this.operadora = operadora;
        this.limite = limite;
        this.tipoDeCartao = tipoDeCartao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cartão de Crédito - Número: ").append(numero)
                .append(" | Operadora: ").append(operadora)
                .append(" | Limite: R$").append(limite)
                .append(" | Tipo: ").append(tipoDeCartao);
        return sb.toString();
    }
}

