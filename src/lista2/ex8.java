package lista2;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = en.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = en.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        en.close();
    }
}
