package lista5;

import java.util.Scanner;

public class ex05Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;

        while (true) {
            ex05 item = new ex05();
            System.out.print("Digite o código do item (0 para encerrar): ");
            int codigo = input.nextInt();
            if (codigo == 0) break;
            item.setCodigo(codigo);
            System.out.print("Digite a quantidade: ");
            item.setQuantidade(input.nextInt());

            System.out.println(item.toString());
            total += item.valorItem();
        }

        System.out.println("Total geral do pedido: R$ " + total);
        input.close();
    }
}
