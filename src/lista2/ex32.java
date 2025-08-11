package lista2;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tipos de carne:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Escolha o tipo (1-3): ");
        int tipo = sc.nextInt();

        System.out.print("Digite a quantidade (Kg): ");
        double quantidade = sc.nextDouble();

        System.out.print("Pagamento com cartão Tabajara? (S/N): ");
        char cartao = sc.next().toUpperCase().charAt(0);

        String nomeCarne = "";
        double precoKg = 0;

        switch (tipo) {
            case 1:
                nomeCarne = "File Duplo";
                precoKg = (quantidade <= 5) ? 4.90 : 5.80;
                break;
            case 2:
                nomeCarne = "Alcatra";
                precoKg = (quantidade <= 5) ? 5.90 : 6.80;
                break;
            case 3:
                nomeCarne = "Picanha";
                precoKg = (quantidade <= 5) ? 6.90 : 7.80;
                break;
            default:
                System.out.println("Tipo inválido!");
                sc.close();
                return;
        }

        double total = quantidade * precoKg;
        double desconto = (cartao == 'S') ? total * 0.05 : 0;
        double valorFinal = total - desconto;

        System.out.println("\n--- CUPOM FISCAL ---");
        System.out.println("Tipo de carne: " + nomeCarne);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preço total: R$ " + total);
        System.out.println("Tipo de pagamento: " + ((cartao == 'S') ? "Cartão Tabajara" : "Outro"));
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor a pagar: R$ " + valorFinal);

        sc.close();
    }
}
