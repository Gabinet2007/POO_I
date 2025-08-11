package lista2;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Insira um ano de 4 dígitos: ");
        int y = en.nextInt();

        if (y >= 1000 && y <= 9999) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                System.out.println("Ano bissexto");
            } else {
                System.out.println("Não é bissexto");
            }
        }
        en.close();
    }
}
