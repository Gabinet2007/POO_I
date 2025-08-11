package lista1;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = en.nextDouble();
        double area = (raio*raio) * 3.14;
        System.out.println("Um circulo de raio " + raio + " possui uma área de " + area);

        en.close();
    }
}