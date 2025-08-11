package lista2;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        double n1, n2, n3, media;

        System.out.print("Digite a primeira nota: ");
        n1 = en.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = en.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = en.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media == 10) {
            System.out.println("Aprovado com Distinção - Média: " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado - Média: " + media);
        } else {
            System.out.println("Reprovado - Média: " + media);
        }

        en.close();
    }
}
