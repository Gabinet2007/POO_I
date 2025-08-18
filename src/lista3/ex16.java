package lista3;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		System.out.println("Insira a quantia de números: ");
		int q = en.nextInt();
		
		int[] nums = new int[q];
		
		for (int x = 0; x < q; x++) {
			System.out.println("Insira o número: ");
			int n = en.nextInt();
			nums[x] = n;
		}
		int menor = nums[0];
		int maior = nums[0];
		int sum = 0;
		for (int x = 0; x < q; x++) {
			if(nums[x] > maior) {
				maior = nums[x];
			} else if(nums[x] < menor) {
				menor = nums[x];
			}
			sum = nums[x] + sum;
		}
		System.out.println("O Maior é: " + maior);
		System.out.println("O Menor é:" + menor);
		System.out.println("A soma é:" + sum);
		en.close();
	}
}
