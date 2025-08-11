package lista2;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Em que turno você estuda? (M-Matutino, V-Vespertino, N-Noturno): ");
        String turno = en.nextLine().toUpperCase();

        switch (turno) {
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Turno inválido!");
        }

        en.close();
    }
}