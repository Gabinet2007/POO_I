package lista2;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        String[] perguntas = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (S/N): ");
            String resposta = en.next().trim().toUpperCase();
            if (resposta.equals("S")) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        en.close();
    }
}
