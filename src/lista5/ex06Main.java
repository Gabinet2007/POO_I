package lista5;

import java.util.Scanner;

public class ex06Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ex06 q = new ex06();

        System.out.print("Digite o tamanho do lado: ");
        q.mudarValorLado(input.nextDouble());

        System.out.println("Lado: " + q.retornarValorLado());
        System.out.println("Área: " + q.calcularArea());
        input.close();
    }
}
