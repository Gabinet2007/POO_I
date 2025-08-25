package lista4;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int mult = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = input.nextInt();
            soma += numeros[i];
            mult *= numeros[i];
        }

        System.out.println("Números digitados:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + mult);
    }
}
