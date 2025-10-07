package lista8.ContaAvancada;

public class Banco {
    private int codigo;
    private String nome;
    private int numeroAgencias;

    public Banco(int codigo, String nome, int numeroAgencias) {
        this.codigo = codigo;
        this.nome = nome;
        this.numeroAgencias = numeroAgencias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banco - Código: ").append(codigo)
                .append(" | Nome: ").append(nome)
                .append(" | Número de Agências: ").append(numeroAgencias);
        return sb.toString();
    }
}

