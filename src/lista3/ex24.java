package lista3;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs: ");
        int qtd = en.nextInt();

        double soma = 0;
        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite o valor do CD " + i + ": ");
            soma += en.nextDouble();
        }

        double media = soma / qtd;
        System.out.println("Valor total investido: R$ " + soma);
        System.out.println("Valor médio por CD: R$ " + media);

        en.close();
    }
}
