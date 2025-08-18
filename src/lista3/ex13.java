package lista3;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		System.out.print("Insira o número para calcular o fatorial: ");
		int lim = en.nextInt();

		int fat = lim;
		for (int x = lim; x > 1; x--) {
			fat = fat * (x - 1);
		}
		System.out.println(lim + "! = " + fat);
		en.close();
	}
}
