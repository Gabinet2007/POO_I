package lista4;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = input.nextLine();

        char[] vetor = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            vetor[i] = texto.charAt(i);
        }

        System.out.println("Texto armazenado no vetor:");
        for (char c : vetor) {
            System.out.print("[" + c + "]");
        }
    }
}
