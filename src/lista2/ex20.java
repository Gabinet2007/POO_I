package lista2;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = en.nextInt();

        boolean bissexto;

        bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);

        if (bissexto) {
            System.out.println(ano + " é ano bissexto.");
        } else {
            System.out.println(ano + " não é ano bissexto.");
        }

        en.close();
    }
}
