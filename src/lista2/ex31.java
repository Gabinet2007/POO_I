package lista2;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade (Kg) de morangos: ");
        double kgMorango = sc.nextDouble();
        System.out.print("Digite a quantidade (Kg) de maçãs: ");
        double kgMaca = sc.nextDouble();

        double precoMorango = (kgMorango <= 5) ? 2.50 : 2.20;
        double precoMaca = (kgMaca <= 5) ? 1.80 : 1.50;

        double total = (kgMorango * precoMorango) + (kgMaca * precoMaca);

        if ((kgMorango + kgMaca) > 8 || total > 25) {
            total -= total * 0.10;
        }

        System.out.println("Valor a pagar: R$ " + total);
        sc.close();
    }
}
