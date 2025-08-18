package lista3;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o número total de votantes: ");
        int n = en.nextInt();

        int c1 = 0, c2 = 0, c3 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Voto do eleitor " + i + " (1, 2 ou 3): ");
            int voto = en.nextInt();

            if (voto == 1) c1++;
            else if (voto == 2) c2++;
            else if (voto == 3) c3++;
            else System.out.println("Voto inválido!");
        }

        System.out.println("Resultado da eleição:");
        System.out.println("Candidato 1: " + c1 + " votos");
        System.out.println("Candidato 2: " + c2 + " votos");
        System.out.println("Candidato 3: " + c3 + " votos");

        en.close();
    }
}
