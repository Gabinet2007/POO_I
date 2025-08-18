package lista3;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int num = en.nextInt();
        System.out.print("Começar por: ");
        int ini = en.nextInt();
        System.out.print("Terminar em: ");
        int fim = en.nextInt();

        if (fim < ini) {
            System.out.println("Intervalo inválido! O final deve ser maior ou igual ao inicial.");
        } else {
            System.out.println("Vou montar a tabuada de " + num + " começando em " + ini + " e terminando em " + fim + ":");
            for (int i = ini; i <= fim; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
        en.close();
    }
}
