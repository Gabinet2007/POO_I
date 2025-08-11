package lista2;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = en.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = en.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito;

        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
        } else if (media >= 7.5) {
            conceito = "B";
        } else if (media >= 6.0) {
            conceito = "C";
        } else if (media >= 4.0) {
            conceito = "D";
        } else if (media >= 0) {
            conceito = "E";
        } else {
            conceito = "Inválido";
        }

        System.out.printf("Notas: %.2f e %.2f\n", nota1, nota2);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Conceito: " + conceito);

        if ("ABC".contains(conceito)) {
            System.out.println("APROVADO");
        } else if ("DE".contains(conceito)) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("Conceito inválido");
        }

        en.close();
    }
}
