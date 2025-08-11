package lista2;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int num = en.nextInt();

        if (num < 0 || num >= 1000) {
            System.out.println("Número inválido.");
            en.close();
            return;
        }

        int centenas = num / 100;
        int dezenas = (num % 100) / 10;
        int unidades = num % 10;

        System.out.println("Centenas: " + centenas);
        System.out.println("Dezenas: " + dezenas);
        System.out.println("Unidades: " + unidades);

        en.close();
    }
}
