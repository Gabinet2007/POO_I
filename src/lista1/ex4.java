package lista1;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float numI = en.nextFloat();
        System.out.println("Nota adicionada: " + numI);

        System.out.print("Nota 2: ");
        float numII = en.nextFloat();
        System.out.println("Nota adicionada: " + numII);

        System.out.print("Nota 3: ");
        float numIII = en.nextFloat();
        System.out.println("Nota adicionada: " + numIII);

        System.out.print("Nota 4: ");
        float numIV = en.nextFloat();
        System.out.println("Nota adicionada: " + numIV);

        float med = (numI + numII + numIII + numIV) / 4;
        System.out.println("média: " + med);
        en.close();
    }
}