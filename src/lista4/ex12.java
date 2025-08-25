package lista4;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] idades = new int[5];
        double[] alturas = new double[5];
        int maisVelho = 0, maisNovo = 0, maisBaixo = 0, maisAlto = 0;
        int somaIdade = 0;
        double somaAltura = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = input.nextInt();
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = input.nextDouble();

            somaIdade += idades[i];
            somaAltura += alturas[i];

            if (i == 0 || idades[i] > idades[maisVelho]) maisVelho = i;
            if (i == 0 || idades[i] < idades[maisNovo]) maisNovo = i;
            if (i == 0 || alturas[i] > alturas[maisAlto]) maisAlto = i;
            if (i == 0 || alturas[i] < alturas[maisBaixo]) maisBaixo = i;
        }

        double mediaIdade = somaIdade / 5.0;
        double mediaAltura = somaAltura / 5.0;

        System.out.println("\nOrdem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Idade: " + idades[i] + " | Altura: " + alturas[i]);
        }

        System.out.println("\nMais velho: idade " + idades[maisVelho] + " altura " + alturas[maisVelho]);
        System.out.println("Mais novo: idade " + idades[maisNovo] + " altura " + alturas[maisNovo]);
        System.out.println("Mais alto: idade " + idades[maisAlto] + " altura " + alturas[maisAlto]);
        System.out.println("Mais baixo: idade " + idades[maisBaixo] + " altura " + alturas[maisBaixo]);

        System.out.println("\nAbaixo da média:");
        for (int i = 0; i < 5; i++) {
            if (idades[i] < mediaIdade || alturas[i] < mediaAltura) {
                System.out.println("Idade: " + idades[i] + " | Altura: " + alturas[i]);
            }
        }

        System.out.println("\nAcima da média:");
        for (int i = 0; i < 5; i++) {
            if (idades[i] >= mediaIdade || alturas[i] >= mediaAltura) {
                System.out.println("Idade: " + idades[i] + " | Altura: " + alturas[i]);
            }
        }
    }
}
