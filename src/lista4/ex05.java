package lista4;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tot = new int[20];
        int par = 0;
        int impar = 0;

        for (int x = 0; x < 20; x++) {
            System.out.print("Insira o número " + (x + 1) + ": ");
            tot[x] = input.nextInt();

            if (tot[x] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        int[] pares = new int[par];
        int[] impares = new int[impar];

        int ip = 0;
        int ii = 0;

        for (int x = 0; x < 20; x++) {
            if (tot[x] % 2 == 0) {
                pares[ip] = tot[x];
                ip++;
            } else {
                impares[ii] = tot[x];
                ii++;
            }
        }

        System.out.println("\nVetor total:");
        for (int x = 0; x < 20; x++) {
            System.out.print(tot[x] + " ");
        }

        System.out.println("\n\nPares totais: " + par);
        for (int x = 0; x < par; x++) {
            System.out.print(pares[x] + " ");
        }

        System.out.println("\n\nImpares totais: " + impar);
        for (int x = 0; x < impar; x++) {
            System.out.print(impares[x] + " ");
        }
    }
}
