package lista8.ContaAvancada;

public class ContaBancaria {
    protected Banco banco;
    protected int agencia;
    private int numeroDaConta;
    private double saldo;
    protected Pessoa correntista;

    public ContaBancaria(Banco banco, int agencia, int numeroDaConta, Pessoa correntista) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conta Bancária - Agência: ").append(agencia)
                .append(" | Número: ").append(numeroDaConta)
                .append(" | Saldo: R$").append(saldo).append("\n")
                .append(correntista.toString()).append("\n")
                .append(banco.toString());
        return sb.toString();
    }
}

