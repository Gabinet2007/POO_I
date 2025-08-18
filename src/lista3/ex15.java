package lista3;

import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Insira o número de termos da série: ");
        int lim = en.nextInt();

        int max = lim;
        double sum = 0;
        for (int i = 1; i <= lim; i++) {
            sum = (double) (((max-1) * max)/i)+sum;
            System.out.println("(" + (max-1) + " * " + max + ")" + " / " + i);
            max--;
        }

        System.out.println("A soma é: " + sum);

        en.close();
    }
}
