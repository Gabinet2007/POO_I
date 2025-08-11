import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe um inteiro: ");
		int numI = en.nextInt();
		
		System.out.print("Informe mais um inteiro: ");
		int numII = en.nextInt();
		
		System.out.print("Informe um real: ");
		float numIII = en.nextFloat();
		
		float calcI = (numI*2) * (numII/2.0f);
		float calcII = (numI*3) + numIII;
		float calcIII = numIII*numIII*numIII;
		
		System.out.println("produto do dobro do primeiro com metade do segundo: " + calcI);
		System.out.println("soma do triplo do primeiro com o terceiro: " + calcII);
		System.out.println("terceiro elevado ao cubo: " + calcIII);
		
		
		
		en.close();
	}
}
