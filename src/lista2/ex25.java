package lista2;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o valor do saque (entre 10 e 600): ");
        int valor = en.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido.");
        } else {
            int n100 = valor / 100;
            valor %= 100;

            int n50 = valor / 50;
            valor %= 50;

            int n10 = valor / 10;
            valor %= 10;

            int n5 = valor / 5;
            valor %= 5;

            int n1 = valor;

            System.out.println("Notas de 100: " + n100);
            System.out.println("Notas de 50: " + n50);
            System.out.println("Notas de 10: " + n10);
            System.out.println("Notas de 5: " + n5);
            System.out.println("Notas de 1: " + n1);
        }

        en.close();
    }
}
