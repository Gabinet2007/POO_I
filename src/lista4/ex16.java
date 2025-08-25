package lista4;

import java.io.*;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um valor ímpar entre 3 e 11: ");
            n = input.nextInt();
        } while (n < 3 || n > 11 || n % 2 == 0);

        int[][] matriz = new int[n][n];
        int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int pares = 0, impares = 0;
        int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

        // Lendo valores
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();

                soma += matriz[i][j];
                if (matriz[i][j] > maior) maior = matriz[i][j];
                if (matriz[i][j] < menor) menor = matriz[i][j];
                if (matriz[i][j] % 2 == 0) pares++;
                else impares++;

                if (i == j) somaDiagonalPrincipal += matriz[i][j];
                if (i + j == n - 1) somaDiagonalSecundaria += matriz[i][j];
            }
        }

        double media = (double) soma / (n * n);

        System.out.println("\nMatriz:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }

        // Mostrando resultados
        StringBuilder resultado = new StringBuilder();
        resultado.append("\nSoma dos elementos: ").append(soma)
                .append("\nMédia dos elementos: ").append(String.format("%.2f", media))
                .append("\nMaior valor: ").append(maior)
                .append("\nMenor valor: ").append(menor)
                .append("\nQuantidade de pares: ").append(pares)
                .append("\nQuantidade de ímpares: ").append(impares)
                .append("\nSoma da diagonal principal: ").append(somaDiagonalPrincipal)
                .append("\nSoma da diagonal secundária: ").append(somaDiagonalSecundaria);

        System.out.println(resultado);

        // Salvando em arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("matriz.txt"))) {
            for (int[] linha : matriz) {
                for (int valor : linha) {
                    bw.write(valor + " ");
                }
                bw.newLine();
            }
            bw.write(resultado.toString());
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo!");
        }

        // Lendo do arquivo
        System.out.println("\n--- Conteúdo do arquivo ---");
        try (BufferedReader br = new BufferedReader(new FileReader("matriz.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }
}
