import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		System.out.print("Informe o salario: ");
		double sal = en.nextDouble();
		System.out.print("Informe as horas: ");
		int hora = en.nextInt();

		double salb = sal * hora;
		System.out.println("Salário bruto: " + salb);
		double inss = salb * 0.08;
		System.out.println("Valor do INSS: " + inss);
		double sind = salb * 0.05;
		System.out.println("Valor do sindicato: " + inss);
		double ir = salb * 0.11;
		System.out.println("Valor do imposto de renda: " + ir);
		double descontos = inss + sind + ir;
		System.out.println("Valor das despesas: " + descontos);
		double sall = salb - descontos;
		System.out.println("Salário líquido: " + sall);


		en.close();
	}
}
