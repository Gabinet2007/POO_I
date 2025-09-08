package lista5;

import java.util.Scanner;

public class ex01Main {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        ex01 q = new ex01();

        System.out.print("Insira seu nome: ");
        q.setNome(input.nextLine());
        System.out.print("Insira seu sobrenome: ");
        q.setSobrenome(input.nextLine());

        System.out.println(q.toString());
        input.close();
    }
}