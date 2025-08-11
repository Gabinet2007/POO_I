package lista1;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Informe a base do quadrado: ");
        float base = en.nextFloat();
        System.out.print("Informe a altura do quadrado: ");
        float altura = en.nextFloat();
        float area = base * altura;
        System.out.println("O quadrado tem área de: " + area);

        en.close();
    }
}