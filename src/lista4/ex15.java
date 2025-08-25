package lista4;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int N = 5;
        int[] valores = new int[N];

        for (int i = 0; i < N; i++) {
            int valor;
            do {
                System.out.print("Digite um valor entre 0 e 20: ");
                valor = input.nextInt();
            } while (valor < 0 || valor > 20);
            valores[i] = valor;
        }

        System.out.println("\nGráfico:");
        for (int v : valores) {
            System.out.print(v + ": ");
            for (int j = 0; j < v; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
