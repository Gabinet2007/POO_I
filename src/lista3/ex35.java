package lista3;

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        double total = 0;
        while (true) {
            System.out.print("Digite o código do item (0 para encerrar): ");
            int cod = en.nextInt();
            if (cod == 0) {
                break;
            }

            System.out.print("Digite a quantidade: ");
            int qtd = en.nextInt();

            double preco = 0;
            String item = "";

            switch (cod) {
                case 100:
                    item = "Cachorro Quente";
                    preco = 1.20;
                    break;
                case 101:
                    item = "Bauru Simples";
                    preco = 1.30;
                    break;
                case 102:
                    item = "Bauru com ovo";
                    preco = 1.50;
                    break;
                case 103:
                    item = "Hambúrguer";
                    preco = 1.20;
                    break;
                case 104:
                    item = "Cheeseburguer";
                    preco = 1.30;
                    break;
                case 105:
                    item = "Refrigerante";
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }

            double subtotal = preco * qtd;
            total += subtotal;
            System.out.println(item + " - Quantidade: " + qtd + " - Valor: R$ " + subtotal);
        }

        System.out.println("Total do pedido: R$ " + total);
        en.close();
    }
}
