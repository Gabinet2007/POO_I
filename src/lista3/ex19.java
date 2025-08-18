package lista3;

import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Insira o valor de N: ");
        int N = en.nextInt();

        int divisões = 0;

        System.out.println("Primos entre 1 e " + N + ":");
        for (int num = 2; num <= N; num++) {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) { 
                divisões++;
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nNúmero total de divisões executadas: " + divisões);

        en.close();
    }
}
