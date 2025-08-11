package lista2;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = en.nextDouble();

        if (a == 0) {
            System.out.println("Não é equação do segundo grau.");
            en.close();
            return;
        }

        System.out.print("Digite o valor de B: ");
        double b = en.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = en.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }

        en.close();
    }
}
