package lista4;

import java.util.Random;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder senha = new StringBuilder();

        System.out.print("Digite o tamanho da senha: ");
        int tamanho = input.nextInt();

        if (tamanho <= 0 || tamanho >= alfabeto.length) {
            System.out.println("Tamanho inválido!");
            return;
        }

        for (int i = 0; i < tamanho / 2; i++) {
            // consoante
            char c;
            do {
                c = alfabeto[rand.nextInt(alfabeto.length)];
            } while ("aeiou".indexOf(c) != -1);
            senha.append(c);

            // vogal
            senha.append(vogais[rand.nextInt(vogais.length)]);
        }

        // Se for ímpar, termina em consoante
        if (tamanho % 2 != 0) {
            char c;
            do {
                c = alfabeto[rand.nextInt(alfabeto.length)];
            } while ("aeiou".indexOf(c) != -1);
            senha.append(c);
        }

        System.out.println("Senha gerada: " + senha);
    }
}
