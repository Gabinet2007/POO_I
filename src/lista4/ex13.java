package lista4;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = input.nextInt();
        }

        System.out.println("Digite os 10 elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = input.nextInt();
        }

        int pos = 0;
        for (int i = 0; i < 10; i++) {
            vetor3[pos++] = vetor1[i];
            vetor3[pos++] = vetor2[i];
        }

        System.out.println("Vetor intercalado:");
        for (int v : vetor3) {
            System.out.print(v + " ");
        }
    }
}
