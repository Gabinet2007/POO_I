package lista4;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAltura = 0;
        int contador = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = input.nextInt();
            System.out.print("Digite a altura do aluno " + (i + 1) + ": ");
            alturas[i] = input.nextDouble();
            somaAltura += alturas[i];
        }

        double mediaAltura = somaAltura / 30.0;

        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }

        System.out.println("Quantidade de alunos com mais de 13 anos e altura abaixo da média: " + contador);
    }
}
