package lista3;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		int tab;
		do {
			System.out.println("Número da taboada: ");
			tab = en.nextInt();

			if (tab <= 10 && tab >= 1) {
				for (int x = 1; x <= 10; x++) {
					int res = x * tab;
					System.out.println(tab + " * " + x + " = " + res);
				}
			} else {
				System.out.println("Número inválido!");
			}
		} while (tab > 10 || tab < 1);

		en.close();
	}

}
