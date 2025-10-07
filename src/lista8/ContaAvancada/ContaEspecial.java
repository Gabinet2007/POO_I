package lista8.ContaAvancada;

public class ContaEspecial extends ContaBancaria {
    private int diasSemJuros;
    private double limite;
    protected CartaoDeCredito cartao;

    public ContaEspecial(Banco banco, int agencia, int numeroDaConta, Pessoa correntista,
                         int diasSemJuros, double limite, CartaoDeCredito cartao) {
        super(banco, agencia, numeroDaConta, correntista);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Conta Especial ===\n")
                .append(super.toString()).append("\n")
                .append("Dias sem Juros: ").append(diasSemJuros)
                .append(" | Limite: R$").append(limite).append("\n")
                .append(cartao.toString());
        return sb.toString();
    }
}
