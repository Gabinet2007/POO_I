import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe um inteiro: ");
		double altura = en.nextDouble();
		
		double pesoM = (72.7 * altura) - 58;
		double pesoF = (62.1 * altura) - 44.7;
		
		System.out.println("Peso ideal masculino: " + pesoM);
		System.out.println("Peso ideal feminino: " + pesoF);
		
		
		
		en.close();
	}
}
