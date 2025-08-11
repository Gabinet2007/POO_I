package lista2;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o lado 2: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o lado 3: ");
        double lado3 = sc.nextDouble();

        boolean formaTriangulo = (lado1 + lado2 > lado3) &&
                (lado1 + lado3 > lado2) &&
                (lado2 + lado3 > lado1);

        if (!formaTriangulo) {
            System.out.println("Não forma um triângulo");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        }

        sc.close();
    }
}
