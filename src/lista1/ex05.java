package lista1;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Informe o valor (em metros) que será convertido para centímetros: ");
        float num = en.nextFloat();
        float cent = num * 100;
        System.out.println(num + "M corresponde a " + cent + "cm");

        en.close();
    }
}