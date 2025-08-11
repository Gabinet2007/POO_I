package lista2;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = en.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = en.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char op = en.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Divisão por zero não permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);

            // Par ou ímpar
            if (resultado % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }

            // Positivo ou negativo
            if (resultado >= 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }

            // Inteiro ou decimal
            if (resultado == Math.floor(resultado)) {
                System.out.println("Inteiro");
            } else {
                System.out.println("Decimal");
            }
        }

        en.close();
    }
}
