package lista3;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		double n;
		boolean ver;
		do {
			System.out.print("informe uma nota de 0 a 10: ");
			n = en.nextFloat();
			ver = n >= 0 && n <= 10;
			if (ver == false) {
				System.out.println("O valor " + n + " não está entre 0 e 10");
			}
		} while (ver == false);
		System.out.println("finalizado");
		
		en.close();
	}
}