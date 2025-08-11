package lista2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Digite um número número: ");
        int n1 = en.nextInt();
        System.out.println("Seu número é: ");
        if (n1 > 0) {
            System.out.println("Positivo");
        } else if (n1 < 0) {
            System.out.println("Negativo");
        } else if (n1 == 0) {
            System.out.println("Zero");
        }
        en.close();
    }
}
