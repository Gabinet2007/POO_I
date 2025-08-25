package lista4;

import java.io.*;
import java.util.*;

public class ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Sorteio oficial
        Set<Integer> sorteio = new TreeSet<>();
        while (sorteio.size() < 6) sorteio.add(rand.nextInt(60) + 1);

        System.out.println("Números sorteados: " + sorteio);

        System.out.print("Quantas cartelas deseja? ");
        int n = input.nextInt();

        int[][] cartelas = new int[n][6];
        StringBuilder resultado = new StringBuilder("\n--- Resultado Loteria ---\n");

        for (int i = 0; i < n; i++) {
            Set<Integer> numeros = new TreeSet<>();
            while (numeros.size() < 6) numeros.add(rand.nextInt(60) + 1);

            int idx = 0, acertos = 0;
            for (int num : numeros) {
                cartelas[i][idx++] = num;
                if (sorteio.contains(num)) acertos++;
            }

            resultado.append("Cartela ").append(i + 1).append(": ").append(numeros)
                    .append(" | Acertos: ").append(acertos).append("\n");
        }

        System.out.println(resultado);

        // Gravar arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("loteria.txt"))) {
            bw.write("Números sorteados: " + sorteio + "\n");
            bw.write(resultado.toString());
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo!");
        }

        // Ler arquivo
        System.out.println("\n--- Conteúdo do arquivo ---");
        try (BufferedReader br = new BufferedReader(new FileReader("loteria.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) System.out.println(linha);
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo!");
        }
    }
}
