package lista5;

import java.util.Scanner;

public class ex02Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ex02 q = new ex02();

        System.out.print("Insira o primeiro numero: ");
        q.setNum1(input.nextInt());
        System.out.print("Insira o segundo numero: ");
        q.setNum2(input.nextInt());

        System.out.println(q.toString());

        int min = q.getNum1();
        int max = q.getNum2();

        if (min > max) {
            System.out.println(" --- VALORES INVERTIDOS! --- ");
            int buffer = max;
            max = min;
            min = buffer;
        }

        for (int x = min + 1; x < max; x++) {
            System.out.println(x);
        }
        input.close();
    }
}
