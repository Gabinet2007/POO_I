package lista3;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Quantas notas deseja inserir? ");
        int n = en.nextInt();

        double soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = en.nextDouble();
            soma += nota;
        }

        double media = soma / n;
        System.out.println("A média aritmética é: " + media);

        en.close();
    }
}
