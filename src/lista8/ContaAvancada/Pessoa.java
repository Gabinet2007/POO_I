package lista8.ContaAvancada;

public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Correntista - Nome: ").append(nome)
                .append(" | Endereço: ").append(endereco);
        return sb.toString();
    }
}
