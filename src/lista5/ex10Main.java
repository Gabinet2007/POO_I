package lista5;

import java.util.Scanner;

public class ex10Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o canal inicial (1-100): ");
        int canal = input.nextInt();

        System.out.print("Digite o volume inicial (0-50): ");
        int volume = input.nextInt();

        ex10 tv = new ex10(canal, volume);

        int opcao;
        do {
            System.out.println("\n--- MENU TV ---");
            System.out.println("1 - Mudar canal");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("4 - Consultar estado da TV");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Novo canal (1-100): ");
                    int novoCanal = input.nextInt();
                    tv.setCanal(novoCanal);
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 4:
                    System.out.println(tv);
                    break;
                case 0:
                    System.out.println("Desligando TV...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        input.close();
    }
}
