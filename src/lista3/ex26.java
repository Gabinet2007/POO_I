package lista3;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Preço do pão: R$ ");
        double preco = input.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++) {
            double total = preco * i;
            System.out.println(i + " - R$ " + String.format("%.2f", total));
        }

        input.close();
    }
}
