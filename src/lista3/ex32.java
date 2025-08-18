package lista3;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] codigo = new int[5];
        int[] veiculos = new int[5];
        int[] acidentes = new int[5];

        int somaVeiculos = 0;
        int somaAcidentes = 0;
        int somaAcidentesMenos2000 = 0;
        int contMenos2000 = 0;

        int maiorIndice = -1;
        int menorIndice = Integer.MAX_VALUE;
        int cidadeMaior = 0, cidadeMenor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o código da cidade " + (i + 1) + ": ");
            codigo[i] = input.nextInt();

            System.out.print("Digite o número de veículos de passeio: ");
            veiculos[i] = input.nextInt();

            System.out.print("Digite o número de acidentes de trânsito com vítimas: ");
            acidentes[i] = input.nextInt();

            somaVeiculos += veiculos[i];
            somaAcidentes += acidentes[i];

            int indice = acidentes[i] / veiculos[i]; // índice simples

            if (indice > maiorIndice) {
                maiorIndice = indice;
                cidadeMaior = codigo[i];
            }
            if (indice < menorIndice) {
                menorIndice = indice;
                cidadeMenor = codigo[i];
            }

            if (veiculos[i] < 2000) {
                somaAcidentesMenos2000 += acidentes[i];
                contMenos2000++;
            }
        }

        System.out.println("Maior índice de acidentes: cidade " + cidadeMaior + " com índice " + maiorIndice);
        System.out.println("Menor índice de acidentes: cidade " + cidadeMenor + " com índice " + menorIndice);
        System.out.println("Total de veículos nas cinco cidades: " + somaVeiculos);
        System.out.println("Média de acidentes nas cinco cidades: " + (somaAcidentes / 5));
        if (contMenos2000 > 0) {
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + (somaAcidentesMenos2000 / contMenos2000));
        } else {
            System.out.println("Nenhuma cidade com menos de 2000 veículos.");
        }

        input.close();
    }
}
