package lista2;

import java.util.Scanner;
import java.util.Arrays;

public class ex07 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        double[] numeros = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = en.nextDouble();
        }

        Arrays.sort(numeros);
        System.out.println("Ordem decrescente:");
        for (int i = 2; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        en.close();
    }
}
