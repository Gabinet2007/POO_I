package lista2;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = en.nextLine();

        String[] partes = data.split("/");

        if (partes.length != 3) {
            System.out.println("Data inválida");
            en.close();
            return;
        }

        int dia, mes, ano;

        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
            System.out.println("Data inválida");
            en.close();
            return;
        }

        boolean dataValida = true;

        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            dataValida = false;
        } else {
            int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            boolean bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
            if (bissexto) {
                diasNoMes[1] = 29;
            }

            if (dia > diasNoMes[mes - 1]) {
                dataValida = false;
            }
        }

        if (dataValida) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }

        en.close();
    }
}
