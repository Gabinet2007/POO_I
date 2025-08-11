package lista1;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Informe o valor que recebe por hora: ");
        float salario = en.nextFloat();
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        float hora = en.nextFloat();
        float sal = salario * hora;
        System.out.println("Você receberá: " + sal + " reais");

        en.close();
    }
}