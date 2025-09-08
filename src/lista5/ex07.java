package lista5;

public class ex07 {
    private String nome = "SEM NOME";
    private int idade = 21;
    private double peso = 70;
    private double altura = 170; // em centímetros

    public ex07() {}

    public ex07(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        idade++;
        if (idade < 21) {
            crescer(0.5);
        }
    }

    public void engordar(double kg) {
        peso += kg;
    }

    public void emagrecer(double kg) {
        peso -= kg;
    }

    public void crescer(double cm) {
        altura += cm;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pessoa [nome=").append(nome);
        builder.append(", idade=").append(idade);
        builder.append(", peso=").append(peso).append(" kg");
        builder.append(", altura=").append(altura).append(" cm]");
        return builder.toString();
    }
}
