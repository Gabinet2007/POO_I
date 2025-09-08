package lista5;

import java.util.Scanner;

public class ex03Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ex03 q = new ex03();

        System.out.print("Insira o primeiro numero: ");
        q.setNum1(input.nextInt());
        System.out.print("Insira o segundo numero: ");
        q.setNum2(input.nextInt());


        int opcao;
        do {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Soma: ");
                    System.out.println(q.soma());
                    break;
                case 2:
                    System.out.print("Subtração: ");
                        System.out.println(q.subtracao());
                    break;
                case 3:
                    System.out.print("Multiplicação: ");
                        System.out.println(q.multiplicacao());
                    break;
                case 4:
                    System.out.print("Divisão: ");
                        System.out.println(q.divisao());
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
