package lista4;

import java.io.*;
import java.util.*;

public class ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de atletas: ");
        int n = input.nextInt();

        String[] nomes = new String[n];
        double[][] saltos = new double[n][5];
        double[] medias = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome do atleta " + (i + 1) + ": ");
            nomes[i] = input.next();

            double soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
            for (int j = 0; j < 5; j++) {
                System.out.print("Salto " + (j + 1) + ": ");
                saltos[i][j] = input.nextDouble();
                soma += saltos[i][j];
                if (saltos[i][j] > maior) maior = saltos[i][j];
                if (saltos[i][j] < menor) menor = saltos[i][j];
            }
            medias[i] = (soma - menor) / 4.0; // descartando o pior salto
            System.out.println("Média (descartando pior salto): " + String.format("%.2f", medias[i]));
        }

        int campeao = 0, ultimo = 0;
        for (int i = 0; i < n; i++) {
            if (medias[i] > medias[campeao]) campeao = i;
            if (medias[i] < medias[ultimo]) ultimo = i;
        }

        StringBuilder resultado = new StringBuilder("\n--- Resultado ---\n");
        for (int i = 0; i < n; i++) {
            resultado.append(nomes[i]).append(": ");
            for (double s : saltos[i]) resultado.append(s).append(" ");
            resultado.append("| Média: ").append(String.format("%.2f", medias[i])).append("\n");
        }

        resultado.append("\nCampeão: ").append(nomes[campeao]).append(" (").append(medias[campeao]).append(")\n");
        resultado.append("Último: ").append(nomes[ultimo]).append(" (").append(medias[ultimo]).append(")\n");

        System.out.println(resultado);

        // Gravar arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("saltos.txt"))) {
            bw.write(resultado.toString());
        } catch (IOException e) {
            System.out.println("Erro ao salvar!");
        }

        // Ler arquivo
        System.out.println("\n--- Conteúdo do arquivo ---");
        try (BufferedReader br = new BufferedReader(new FileReader("saltos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) System.out.println(linha);
        } catch (IOException e) {
            System.out.println("Erro ao ler!");
        }
    }
}
