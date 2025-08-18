package lista3;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Insira o número de termos da série: ");
        int lim = en.nextInt();

        int n1 = 1, n2 = 1;

        if (lim <= 0) {
            System.out.println("Quantidade inválida!");
        } else if (lim == 1) {
            System.out.println("1");
        } else {
            System.out.print(n1 + " " + n2);

            for (int x = 3; x <= lim; x++) {
                int fib = n1 + n2;
                System.out.print(" " + fib);
                n1 = n2;
                n2 = fib;
            }
        }

        en.close();
    }
}
