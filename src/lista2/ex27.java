package lista2;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = en.nextDouble();

        if (num == Math.floor(num)) {
            System.out.println("Inteiro");
        } else {
            System.out.println("Decimal");
        }

        en.close();
    }
}
