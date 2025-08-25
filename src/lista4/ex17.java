package lista4;

import java.io.*;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] precos = new double[5][5];
        double[] mediaProduto = new double[5];
        double[] somaMercado = new double[5];
        double menorTotal = Double.MAX_VALUE, maiorTotal = Double.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Supermercado " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Preço do produto " + (j + 1) + ": ");
                precos[i][j] = input.nextDouble();
                somaMercado[i] += precos[i][j];
            }
        }

        for (int j = 0; j < 5; j++) {
            double soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += precos[i][j];
            }
            mediaProduto[j] = soma / 5.0;
        }

        for (double total : somaMercado) {
            if (total < menorTotal) menorTotal = total;
            if (total > maiorTotal) maiorTotal = total;
        }

        // Resultados
        StringBuilder resultado = new StringBuilder();

        resultado.append("\n--- Preços por supermercado ---\n");
        for (int i = 0; i < 5; i++) {
            resultado.append("Supermercado ").append(i + 1).append(": ");
            for (int j = 0; j < 5; j++) {
                resultado.append(String.format("%.2f ", precos[i][j]));
            }
            resultado.append(" | Total: ").append(String.format("%.2f", somaMercado[i])).append("\n");
        }

        resultado.append("\nMédia por produto:\n");
        for (int j = 0; j < 5; j++) {
            resultado.append("Produto ").append(j + 1).append(": ").append(String.format("%.2f", mediaProduto[j])).append("\n");
        }

        resultado.append("\nSupermercado mais barato: ").append(String.format("%.2f", menorTotal));
        resultado.append("\nSupermercado mais caro: ").append(String.format("%.2f", maiorTotal));

        System.out.println(resultado);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("supermercados.txt"))) {
            bw.write(resultado.toString());
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo!");
        }

        System.out.println("\n--- Conteúdo do arquivo ---");
        try (BufferedReader br = new BufferedReader(new FileReader("supermercados.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }
}
