package lista2;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = en.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = en.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double c = en.nextDouble();

        double maior = Math.max(a, Math.max(b, c));
        double menor = Math.min(a, Math.min(b, c));

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        en.close();
    }
}
