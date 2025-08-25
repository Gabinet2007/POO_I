package lista4;

import java.io.*;
import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = input.nextInt();
        input.nextLine(); // limpar buffer

        String[] nomes = new String[n];
        double[][] notas = new double[n][2];
        double[] medias = new double[n];
        double somaGeral = 0;

        double maiorNota = Double.MIN_VALUE, menorNota = Double.MAX_VALUE;
        String alunoMaiorNota = "", alunoMenorNota = "";

        double maiorMedia = Double.MIN_VALUE, menorMedia = Double.MAX_VALUE;
        String alunoMaiorMedia = "", alunoMenorMedia = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = input.nextLine();

            System.out.print("Nota 1: ");
            notas[i][0] = input.nextDouble();
            System.out.print("Nota 2: ");
            notas[i][1] = input.nextDouble();
            input.nextLine();

            medias[i] = (notas[i][0] + notas[i][1]) / 2.0;
            somaGeral += medias[i];

            // maior e menor nota
            for (int j = 0; j < 2; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                    alunoMaiorNota = nomes[i];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    alunoMenorNota = nomes[i];
                }
            }

            // maior e menor média
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }

        double mediaGeral = somaGeral / n;

        StringBuilder resultado = new StringBuilder();
        resultado.append("\n--- Alunos ---\n");
        for (int i = 0; i < n; i++) {
            resultado.append(nomes[i]).append(": ")
                    .append(notas[i][0]).append(", ").append(notas[i][1])
                    .append(" | Média: ").append(String.format("%.2f", medias[i]))
                    .append("\n");
        }

        resultado.append("\nMaior nota: ").append(maiorNota).append(" (").append(alunoMaiorNota).append(")\n");
        resultado.append("Menor nota: ").append(menorNota).append(" (").append(alunoMenorNota).append(")\n");
        resultado.append("Maior média: ").append(maiorMedia).append(" (").append(alunoMaiorMedia).append(")\n");
        resultado.append("Menor média: ").append(menorMedia).append(" (").append(alunoMenorMedia).append(")\n");
        resultado.append("Média geral da turma: ").append(String.format("%.2f", mediaGeral)).append("\n");

        resultado.append("\nAcima da média geral:\n");
        for (int i = 0; i < n; i++) {
            if (medias[i] >= mediaGeral) resultado.append(nomes[i]).append("\n");
        }

        resultado.append("\nAbaixo da média geral:\n");
        for (int i = 0; i < n; i++) {
            if (medias[i] < mediaGeral) resultado.append(nomes[i]).append("\n");
        }

        System.out.println(resultado);

        // Gravar em arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("alunos.txt"))) {
            bw.write(resultado.toString());
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo!");
        }

        // Ler arquivo
        System.out.println("\n--- Conteúdo do arquivo ---");
        try (BufferedReader br = new BufferedReader(new FileReader("alunos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) System.out.println(linha);
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo!");
        }
    }
}
