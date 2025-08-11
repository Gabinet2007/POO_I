package lista2;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do aluno 1: ");
        int idade1 = sc.nextInt();

        System.out.print("Digite a idade do aluno 2: ");
        int idade2 = sc.nextInt();

        System.out.print("Digite a idade do aluno 3: ");
        int idade3 = sc.nextInt();

        double media = (idade1 + idade2 + idade3) / 3.0;

        if (media < 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

        sc.close();
    }
}
