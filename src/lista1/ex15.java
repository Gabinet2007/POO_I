import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		System.out.print("Informe o tamanho da área a ser pintada(m²): ");
		double area = en.nextDouble();

		double litros = area / 3;
		double latas = Math.ceil(litros/18);
		double valor = latas * 80;
		System.out.println("Será necessário " + (int)latas + " latas de tinta");
		System.out.println("O valor das latas será: " + valor + " reais");


		en.close();
	}
}
