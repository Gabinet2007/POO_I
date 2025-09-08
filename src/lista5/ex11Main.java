package lista5;

import java.util.Scanner;

public class ex11Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tipo de combustível: ");
        String tipo = input.nextLine();

        System.out.print("Valor por litro: ");
        double valor = input.nextDouble();

        System.out.print("Quantidade inicial de combustível: ");
        double quantidade = input.nextDouble();

        ex11 bomba = new ex11(tipo, valor, quantidade);

        int opcao;
        do {
            System.out.println("\n--- MENU BOMBA ---");
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litro");
            System.out.println("3 - Alterar valor do litro");
            System.out.println("4 - Alterar tipo de combustível");
            System.out.println("5 - Alterar quantidade da bomba");
            System.out.println("6 - Consultar bomba");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Valor em reais: ");
                    double valorAbastecer = input.nextDouble();
                    bomba.abastecerPorValor(valorAbastecer);
                    break;
                case 2:
                    System.out.print("Litros: ");
                    double litros = input.nextDouble();
                    bomba.abastecerPorLitro(litros);
                    break;
                case 3:
                    System.out.print("Novo valor por litro: ");
                    double novoValor = input.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    System.out.print("Novo tipo de combustível: ");
                    String novoTipo = input.nextLine();
                    bomba.alterarCombustivel(novoTipo);
                    break;
                case 5:
                    System.out.print("Nova quantidade de combustível: ");
                    double novaQuantidade = input.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQuantidade);
                    break;
                case 6:
                    System.out.println(bomba);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        input.close();
    }
}
