package lista4;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] notas = new double[4];
		double media = 0;
		double sum = 0;
		for (int x = 0; x < 4; x++) {
			System.out.print("Insira a nota " + (x + 1) + ": ");
			notas[x] = input.nextDouble();
			sum += notas[x];
		}
		media = sum / 4;
		for (int x = 0; x < 4; x++) {
			System.out.println("Nota " + (x + 1) + ": " + notas[x]);
		}
		System.out.print("A média foi de: " + media);
	}
}