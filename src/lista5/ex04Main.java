package lista5;

import java.util.Scanner;

public class ex04Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ex04 q = new ex04();

        System.out.print("Quanto você ganha por hora: ");
        q.setValorHora(input.nextDouble());
        System.out.print("Número de horas trabalhadas no mês: ");
        q.setHorasMes(input.nextDouble());

        System.out.println(q.toString());
        input.close();
    }
}
