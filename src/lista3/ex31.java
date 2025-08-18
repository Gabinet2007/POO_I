package lista3;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alunoMaisAlto = 0, alturaMaisAlta = 0;
        int alunoMaisBaixo = 0, alturaMaisBaixa = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");
            int numeroAluno = input.nextInt();
            System.out.print("Digite a altura do aluno " + numeroAluno + " em cm: ");
            int altura = input.nextInt();

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                alunoMaisAlto = numeroAluno;
            }

            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                alunoMaisBaixo = numeroAluno;
            }
        }

        System.out.println("Aluno mais alto: " + alunoMaisAlto + " com altura de " + alturaMaisAlta + " cm");
        System.out.println("Aluno mais baixo: " + alunoMaisBaixo + " com altura de " + alturaMaisBaixa + " cm");

        input.close();
    }
}
