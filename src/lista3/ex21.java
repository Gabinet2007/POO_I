package lista3;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int n = en.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            soma += en.nextInt();
        }

        double media = (double) soma / n;

        System.out.println("Média de idades: " + media);

        if (media >= 0 && media <= 25) {
            System.out.println("A turma é jovem.");
        } else if (media <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }

        en.close();
    }
}
