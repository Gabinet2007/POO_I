package lista2;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = sc.nextDouble();

        double precoLitro = 0;
        double desconto = 0;

        if (tipo == 'A') {
            precoLitro = 1.90;
            desconto = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipo == 'G') {
            precoLitro = 2.50;
            desconto = (litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Tipo inválido!");
            sc.close();
            return;
        }

        double precoBruto = litros * precoLitro;
        double valorFinal = precoBruto - (precoBruto * desconto);

        System.out.println("Valor a pagar: R$ " + valorFinal);
        sc.close();
    }
}
