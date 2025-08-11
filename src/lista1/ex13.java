import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe o peso: ");
		double peso = en.nextDouble();
		
		double excesso = peso - 50;
		double multa = (peso - 50)*4;
		
		if (excesso > 0) {
		System.out.println("excesso: " + excesso);
		System.out.println("Valor a pagar: " + multa);
		} else {
			System.out.println("Excesso: ZERO OU NEGATIVO");
			System.out.println("Valor a pagar: ZERO OU NEGATIVO");
		}
		
		
		
		en.close();
	}
}
