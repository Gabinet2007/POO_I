package lista1;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int numI = en.nextInt();
        System.out.println("numI: " + numI);

        System.out.print("Segundo número: ");
        int numII = en.nextInt();
        System.out.println("numII: " + numII);

        int sum = numI + numII;
        System.out.println("soma: " + sum);
        en.close();
    }
}