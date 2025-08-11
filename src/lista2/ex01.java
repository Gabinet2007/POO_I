package lista2;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = en.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = en.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior, com o valor de " + n1);
        } else {
            System.out.println("O segundo número é maior, com o valor de " + n2);
        }
        en.close();
    }
}
