package lista3;

import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = en.nextInt();

        boolean primo = true;

        System.out.print("Divisível por: ");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                primo = false;
            }
        }

        System.out.println();

        if (num <= 1) {
            System.out.println(num + " não é primo.");
        } else if (primo) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }

        en.close();
    }
}
