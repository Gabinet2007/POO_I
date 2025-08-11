import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Farenheit: ");
		float F = en.nextFloat();
		
		float C = (5 * (F-32) / 9);
		
		System.out.println("A temperatura em celsius é " + C + "°");
		
		
		
		en.close();
	}
}
