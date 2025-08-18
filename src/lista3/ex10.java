package lista3;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		System.out.println("Primeiro número: ");
		int n1 = en.nextInt();
		
		System.out.println("Segundo número: ");
		int n2 = en.nextInt();

		int sum = n1;
		for (int x = 1; x <= n2; x++) {
			sum = sum * n1;
			System.out.println(sum);
		}
		System.out.println("O valor do cálculo é: " + sum);
		en.close();
	}
}
