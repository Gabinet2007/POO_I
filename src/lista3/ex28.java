package lista3;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        double temp, soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
        int cont = 0;

        System.out.println("Digite as temperaturas (digite 999 para encerrar):");
        while (true) {
            temp = en.nextDouble();
            if (temp == 999) {
                break;
            }
            if (temp > maior) {
                maior = temp;
            }
            if (temp < menor) {
                menor = temp;
            }
            soma += temp;
            cont++;
        }

        if (cont > 0) {
            double media = soma / cont;
            System.out.println("Menor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Média das temperaturas: " + media);
        } else {
            System.out.println("Nenhuma temperatura informada.");
        }
        en.close();
    }
}
