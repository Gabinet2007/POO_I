package lista4;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int x = 0; x < 5; x++) {
			System.out.print("Insira o número " + (x+1) + ": ");
			nums[x] = input.nextInt();
			
		}
		for(int z = 0; z < 5; z++) {
			System.out.println(nums[z]);
		}
	}
}