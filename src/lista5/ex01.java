package lista5;

public class ex01 {
    private String nome = "SEM NOME";
    private String sobrenome = "SEM SOBRENOME";

    public String getNome() {
        return nome;
    }

    public String setSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Seu nome é: ");
        builder.append(nome);
        builder.append(" ");
        builder.append(sobrenome);
        builder.append(".");
        return builder.toString();
    }


}