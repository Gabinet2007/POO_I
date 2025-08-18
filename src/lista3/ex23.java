package lista3;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int turmas = en.nextInt();

        int soma = 0;
        for (int i = 1; i <= turmas; i++) {
            int alunos;
            do {
                System.out.print("Digite a quantidade de alunos da turma " + i + " (máx. 40): ");
                alunos = en.nextInt();
                if (alunos > 40) {
                    System.out.println("Número inválido! Máximo permitido é 40.");
                }
            } while (alunos > 40);

            soma += alunos;
        }

        double media = (double) soma / turmas;
        System.out.println("Número médio de alunos por turma: " + media);

        en.close();
    }
}
