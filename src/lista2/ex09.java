package lista2;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = en.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = en.nextDouble();

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = en.next().toUpperCase();

        double pesoIdeal;
        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso ideal: " + pesoIdeal + " kg");

        if (peso > pesoIdeal) {
            System.out.println("Acima do peso ideal.");
        } else if (peso < pesoIdeal) {
            System.out.println("Abaixo do peso ideal.");
        } else {
            System.out.println("No peso ideal.");
        }

        en.close();
    }
}
