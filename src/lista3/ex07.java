package lista3;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int i1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        int i2 = input.nextInt();

        if (Math.abs(i1 - i2) <= 1) {
            System.out.println("Não há números inteiros no intervalo.");
        } else if (i1 < i2) {
            for (int x = i1 + 1; x < i2; x++) {
                System.out.println(x);
            }
        } else {
            for (int x = i1 - 1; x > i2; x--) {
                System.out.println(x);
            }
        }

        input.close();
    }
}
