package lista2;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite a média do aluno: ");
        double media = en.nextDouble();

        if (media >= 0 && media <= 3) {
            System.out.println("Reprovado");
        } else if (media > 3 && media < 7) {
            System.out.println("Em Exame");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Média inválida");
        }

        en.close();
    }
}
