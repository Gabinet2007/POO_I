package lista3;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            double total = 0;
            int contador = 1;

            System.out.println("Lojas Tabajara");

            while (true) {
                System.out.print("Produto " + contador + ": R$ ");
                double preco = input.nextDouble();

                if (preco == 0) {
                    break;
                }

                total += preco;
                contador++;
            }

            System.out.println("Total: R$ " + String.format("%.2f", total));

            System.out.print("Dinheiro: R$ ");
            double dinheiro = input.nextDouble();

            double troco = dinheiro - total;
            System.out.println("Troco: R$ " + String.format("%.2f", troco));

            System.out.println();
        }
    }
}
