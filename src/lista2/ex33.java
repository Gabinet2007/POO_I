package lista2;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
        char[] respostas = new char[10];
        int pontuacao = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a resposta da questão " + (i + 1) + ": ");
            respostas[i] = sc.next().toLowerCase().charAt(0);
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (respostas[i] == gabarito[i]) {
                System.out.println("Q" + (i + 1) + ": " + respostas[i] + " : Correto");
                pontuacao++;
            } else {
                System.out.println("Q" + (i + 1) + ": " + respostas[i] + " : Errada, resposta correta (" + gabarito[i] + ")");
            }
        }

        System.out.println("Pontuação Final: " + pontuacao);
        sc.close();
    }
}
