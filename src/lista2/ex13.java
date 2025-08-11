package lista2;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o valor por hora: ");
        double valorHora = en.nextDouble();

        System.out.print("Digite as horas trabalhadas no mês: ");
        double horas = en.nextDouble();

        double salarioBruto = valorHora * horas;
        double ir = 0;

        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.10;
        } else {
            ir = salarioBruto * 0.20;
        }

        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("(-) IR: " + ir);
        System.out.println("(-) INSS: " + inss);
        System.out.println("FGTS: " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário Líquido: " + salarioLiquido);

        en.close();
    }
}