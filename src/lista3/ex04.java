package lista3;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int pa, pb;
            double ca, cb;
            do {
                System.out.print("Insira a população do país A: ");
                pa = input.nextInt();
            } while (pa <= 0);

            do {
                System.out.print("Insira a população do país B: ");
                pb = input.nextInt();
            } while (pb <= 0);

            do {
                System.out.print("Insira o crescimento anual do país A (%): ");
                ca = input.nextDouble();
            } while (ca < 0);

            do {
                System.out.print("Insira o crescimento anual do país B (%): ");
                cb = input.nextDouble();
            } while (cb < 0);

            int cont = 0;

            while (pa < pb && cont < 9999) {
                cont++;
                pa += (int) (pa * (ca / 100));
                pb += (int) (pb * (cb / 100));
            }

            if (cont >= 9999) {
                System.out.println("9999+ ou infinitos anos");
            } else {
                System.out.println("Anos necessários: " + cont);
            }

            System.out.print("Deseja repetir a operação? (S/N): ");
            String resp = input.next();
            if (!resp.equalsIgnoreCase("S")) {
                break;
            }
        }

        input.close();
    }
}
