package lista3;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Insira o número de termos da série: ");
        int lim = en.nextInt();

        double soma = 0.0;

        for (int i = 1; i <= lim; i++) {
            int denominador = 2 * i - 1;
            double termo = (double) i / denominador;
            soma += termo;
            System.out.println(i + "/" + denominador);
        }

        System.out.println("Soma da série = " + soma);

        en.close();
    }
}
