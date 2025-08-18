package lista3;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String usu;
		int idade;
		double sal;
		String sexo;
		String ec;
		
		do {
		System.out.print("Insira o nome de usuário(+3 caracteres): ");
		usu = input.nextLine();
		} while (usu.length() < 3);
		
		input.nextLine();
		
		do {
		System.out.print("Insira a sua idade(0 a 150 anos): ");
		idade = input.nextInt();
		
		} while (idade < 0 || idade > 150);
		
		do {
		System.out.print("Insira o seu salário(maior que zero):");
		sal = input.nextDouble();
		}while(sal < 0);
		
		input.nextLine();
		
		do {
		System.out.print("Insira o seu sexo('f' ou 'm'): ");
		sexo = input.nextLine();
		} while(!sexo.equals("f") && !sexo.equals("m") );
		
		do {
		System.out.print("Insira o seu estado civil ('s', 'c', 'v' ou 'd'): ");
		ec = input.nextLine();
		} while(!ec.equals("s") && !ec.equals("c") && !ec.equals("v") && !ec.equals("d"));
		
		input.close();
		
	}
}
