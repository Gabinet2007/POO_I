import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		int n;
		boolean ver;
		do {
			System.out.print("informe um valor par: ");
			n = en.nextInt();
			ver = n % 2 != 0;
			if (ver == true) {
				System.out.println("O valor " + n + " não é par");
			}
		} while (ver == true);
		System.out.println("finalizado");
	}
}
