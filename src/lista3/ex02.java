package lista3;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String usu;
		String pass;
		do {
		
		System.out.print("Insira seu nome de usuário: ");
		usu = input.nextLine();
		
		System.out.print("Insira sua senha: ");
		pass = input.nextLine();
		
		} while (!usu.equals(pass));
		System.out.print("Finalizado ");
		
		
		input.close();
	}
}
