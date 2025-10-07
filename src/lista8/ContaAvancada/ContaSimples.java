package lista8.ContaAvancada;

public class ContaSimples extends ContaBancaria {
    private double saldoPoupanca;

    public ContaSimples(Banco banco, int agencia, int numeroDaConta, Pessoa correntista) {
        super(banco, agencia, numeroDaConta, correntista);
        this.saldoPoupanca = 0.0;
    }

    public boolean depositoPoupanca(double valor) {
        if (valor > 0) {
            saldoPoupanca += valor;
            return true;
        }
        return false;
    }

    public boolean saquePoupanca(double valor) {
        if (valor > 0 && valor <= saldoPoupanca) {
            saldoPoupanca -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Conta Simples ===\n")
                .append(super.toString()).append("\n")
                .append("Saldo Poupança: R$").append(saldoPoupanca);
        return sb.toString();
    }
}

