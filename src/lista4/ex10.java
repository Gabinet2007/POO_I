package lista4;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma data (dd/mm/aaaa): ");
        String data = input.nextLine();

        String[] partes = data.split("/");

        if (partes.length != 3) {
            System.out.println("Formato inválido!");
            return;
        }

        int[] vetor = new int[3];
        try {
            vetor[0] = Integer.parseInt(partes[0]); // dia
            vetor[1] = Integer.parseInt(partes[1]); // mês
            vetor[2] = Integer.parseInt(partes[2]); // ano
        } catch (NumberFormatException e) {
            System.out.println("Data inválida!");
            return;
        }

        if (validaData(vetor[0], vetor[1], vetor[2])) {
            System.out.println("Data válida: ");
            System.out.println("Dia: " + vetor[0] + " | Mês: " + vetor[1] + " | Ano: " + vetor[2]);
        } else {
            System.out.println("Data inválida!");
        }
    }

    public static boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1) return false;
        int[] diasMes = {31, (bissexto(ano) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dia <= diasMes[mes - 1];
    }

    public static boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
