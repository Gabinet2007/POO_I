import java.util.Scanner;

public class aula_0812 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		System.out.print("Informe o primeiro número: ");
		int ini = en.nextInt();
		System.out.println("num 1: " + ini);

		System.out.print("Informe o segundo número: ");
		int fim = en.nextInt();
		System.out.println("num 2: " + fim);

		System.out.print("Número da taboada: ");
		int tab = en.nextInt();
		System.out.println("num tab: " + tab);

		int aux = 0;
		if (ini > fim) {
			aux = ini;
			ini = fim;
			fim = aux;
			System.out.println("TABOADA INVERTIDA");
		}
		for (int x = ini; x <= fim; x++) {
			int res = x * tab;
			System.out.println(x + " * " + tab + " = " + res);

		}

	}

}
