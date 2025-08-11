package lista1;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = en.nextInt();
        System.out.println("O número informado foi " + num);

        en.close();
    }
}