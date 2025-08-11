package lista2;

import java.util.Scanner;


public class ex5 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Insira uma letra: ");
        String letra = en.nextLine().toUpperCase();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("Sua letra é uma vogal");
        } else {
            System.out.println("Sua letra não é uma vogal");
        }
        en.close();
    }
}
