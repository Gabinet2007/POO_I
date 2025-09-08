package lista5;

import java.util.Scanner;

public class ex08Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = input.nextInt();
        input.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nome = input.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = input.nextDouble();

        ex08 conta = new ex08(numero, nome, saldo);

        int opcao;
        do {
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1 - Alterar nome");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Consultar dados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo nome: ");
                    String novoNome = input.nextLine();
                    conta.alterarNome(novoNome);
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    double deposito = input.nextDouble();
                    if (!conta.deposito(deposito)) {
                        System.out.println("Depósito inválido!");
                    }
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    double saque = input.nextDouble();
                    if (!conta.saque(saque)) {
                        System.out.println("Saque inválido ou saldo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println(conta);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        input.close();
    }
}
