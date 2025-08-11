package lista2;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = en.nextInt();

        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        en.close();
    }
}
