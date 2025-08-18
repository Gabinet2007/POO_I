package lista3;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		int[] nums = new int[10];
		for (int x = 0; x <= 9; x++) {
			System.out.println("Insira o número: ");
			int n = en.nextInt();
			nums[x] = n;
		}
		int par = 0;
		int impar = 0;
		for (int x = 0; x <= 9; x++) {
			if(nums[x] % 2 == 0) {
				par++;
			} else if(nums[x] % 2 != 0) {
				impar++;
			}
		}
		System.out.println("O número de pares é: " + par);
		System.out.println("O número de impares é:" + impar);
		en.close();
	}
}
