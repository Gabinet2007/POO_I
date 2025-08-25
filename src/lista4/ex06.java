package lista4;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] medias = new double[10];
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a " + (j+1) + "ª nota do aluno " + (i+1) + ": ");
                soma += input.nextDouble();
            }
            medias[i] = soma / 4.0;
            if (medias[i] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("Número de alunos com média >= 7.0: " + aprovados);
    }
}
