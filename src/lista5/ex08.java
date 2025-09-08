package lista5;

public class ex08 {
    private int numConta;
    private String nome;
    private double saldo;

    public ex08(int numConta, String nome, double saldoInicial) {
        this.numConta = numConta;
        this.nome = nome;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void alterarNome(String novoNome) {
        if (novoNome != null && !novoNome.isEmpty()) {
            this.nome = novoNome;
        }
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Conta [Número=").append(numConta);
        builder.append(", Nome=").append(nome);
        builder.append(", Saldo=R$ ").append(saldo).append("]");
        return builder.toString();
    }
}
