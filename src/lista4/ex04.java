package lista4;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] vetor = new char[10];
        int contadorConsoantes = 0;

        System.out.println("Digite 10 caracteres (letras): ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            vetor[i] = input.next().toLowerCase().charAt(0);

            // Verifica se é letra e não é vogal
            if (Character.isLetter(vetor[i]) &&
                    vetor[i] != 'a' && vetor[i] != 'e' &&
                    vetor[i] != 'i' && vetor[i] != 'o' &&
                    vetor[i] != 'u') {
                contadorConsoantes++;
            }
        }

        System.out.println("\nTotal de consoantes: " + contadorConsoantes);
        System.out.print("Consoantes digitadas: ");
        for (int i = 0; i < vetor.length; i++) {
            if (Character.isLetter(vetor[i]) &&
                    vetor[i] != 'a' && vetor[i] != 'e' &&
                    vetor[i] != 'i' && vetor[i] != 'o' &&
                    vetor[i] != 'u') {
                System.out.print(vetor[i] + " ");
            }
        }

        input.close();
    }
}
