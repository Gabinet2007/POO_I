package lista2;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o salário atual: R$ ");
        double salario = en.nextDouble();

        double percentual = 0;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario <= 700) {
            percentual = 15;
        } else if (salario <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double aumento = salario * percentual / 100;
        double novoSalario = salario + aumento;

        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário após o aumento: R$ " + novoSalario);

        en.close();
    }
}
