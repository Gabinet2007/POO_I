package lista2;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = en.nextInt();

        int convertido;
        if (num % 2 == 0) { // número par
            convertido = num + 1;
        } else { // número ímpar
            convertido = num - 1;
        }

        System.out.println(num + " -> " + convertido);

        en.close();
    }
}
