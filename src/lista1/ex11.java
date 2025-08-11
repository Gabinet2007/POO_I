import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe um inteiro: ");
		double altura = en.nextDouble();
		
		double peso = (72.7 * altura) - 58;
		
		System.out.println("Peso ideal: " + peso);
		
		
		
		en.close();
	}
}
