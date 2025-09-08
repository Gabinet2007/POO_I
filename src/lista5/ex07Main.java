package lista5;

import java.util.Scanner;

public class ex07Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = input.nextLine();

        System.out.print("Digite a idade: ");
        int idade = input.nextInt();

        System.out.print("Digite o peso (kg): ");
        double peso = input.nextDouble();

        System.out.print("Digite a altura (cm): ");
        double altura = input.nextDouble();

        ex07 pessoa = new ex07(nome, idade, peso, altura);

        System.out.println("Dados iniciais: " + pessoa);

        pessoa.envelhecer();
        pessoa.engordar(2);
        pessoa.emagrecer(1);
        pessoa.crescer(0.3);

        System.out.println("Após mudanças: " + pessoa);

        input.close();
    }
}
