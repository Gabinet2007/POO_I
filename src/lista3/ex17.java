package lista3;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num = en.nextInt();

        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }

        en.close();
    }
}
