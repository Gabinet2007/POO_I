package lista3;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int v1 = 0, v2 = 0, v3 = 0, v4 = 0, nulo = 0, branco = 0, total = 0;

        System.out.println("Códigos dos candidatos:");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Nulo");
        System.out.println("6 - Branco");

        while (true) {
            System.out.print("Digite o voto (0 para encerrar): ");
            int voto = en.nextInt();
            if (voto == 0) {
                break;
            }
            switch (voto) {
                case 1: v1++; break;
                case 2: v2++; break;
                case 3: v3++; break;
                case 4: v4++; break;
                case 5: nulo++; break;
                case 6: branco++; break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }
            total++;
        }

        System.out.println("Total de votos para José: " + v1);
        System.out.println("Total de votos para João: " + v2);
        System.out.println("Total de votos para Maria: " + v3);
        System.out.println("Total de votos para Ana: " + v4);
        System.out.println("Total de votos nulos: " + nulo);
        System.out.println("Total de votos em branco: " + branco);

        if (total > 0) {
            double percNulo = (nulo * 100.0) / total;
            double percBranco = (branco * 100.0) / total;
            System.out.println("Percentual de votos nulos: " + percNulo + "%");
            System.out.println("Percentual de votos em branco: " + percBranco + "%");
        }

        en.close();
    }
}
