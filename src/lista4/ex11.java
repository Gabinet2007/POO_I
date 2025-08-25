package lista4;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite palavras separadas por ';': ");
        String texto = input.nextLine();

        String[] palavras = texto.split(";");

        System.out.println("Palavras no vetor:");
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Posição " + i + ": " + palavras[i]);
        }
    }
}
