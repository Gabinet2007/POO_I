package lista3;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int cont0_25 = 0, cont26_50 = 0, cont51_75 = 0, cont76_100 = 0;

        while (true) {
            System.out.print("Digite um número positivo (ou negativo para encerrar): ");
            int n = en.nextInt();
            if (n < 0) {
                break;
            }
            if (n >= 0 && n <= 25) {
                cont0_25++;
            } else if (n >= 26 && n <= 50) {
                cont26_50++;
            } else if (n >= 51 && n <= 75) {
                cont51_75++;
            } else if (n >= 76 && n <= 100) {
                cont76_100++;
            }
        }

        System.out.println("Quantidade no intervalo [0-25]: " + cont0_25);
        System.out.println("Quantidade no intervalo [26-50]: " + cont26_50);
        System.out.println("Quantidade no intervalo [51-75]: " + cont51_75);
        System.out.println("Quantidade no intervalo [76-100]: " + cont76_100);

        en.close();
    }
}
