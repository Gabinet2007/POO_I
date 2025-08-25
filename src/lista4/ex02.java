package lista4;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Float[] reais = new Float[10];
		
		for(int x = 0; x < 10; x++) {
			System.out.print("Insira o número " + (x+1) + ": ");
			reais[x] = input.nextFloat();
		}
		
		for(int x = 9; x >= 0; x--) {
			System.out.println(reais[x]);
		}

	}
}