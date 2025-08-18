package lista3;

import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] gabarito = {'A','B','C','D','E','E','D','C','B','A'};

        int totalAlunos = 0;
        int somaNotas = 0;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;

        boolean continuar = true;

        while (continuar) {
            totalAlunos++;
            int nota = 0;

            System.out.println("Aluno " + totalAlunos + ", digite suas respostas:");

            for (int i = 0; i < gabarito.length; i++) {
                System.out.print("Questão " + (i+1) + ": ");
                char resposta = input.next().toUpperCase().charAt(0);

                if (resposta == gabarito[i]) {
                    nota++;
                }
            }

            System.out.println("Acertos do aluno " + totalAlunos + ": " + nota);
            somaNotas += nota;

            if (nota > maiorNota) maiorNota = nota;
            if (nota < menorNota) menorNota = nota;

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            char resp = input.next().toUpperCase().charAt(0);
            if (resp == 'N') {
                continuar = false;
            }
        }

        double media = (double) somaNotas / totalAlunos;

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Maior acerto: " + maiorNota);
        System.out.println("Menor acerto: " + menorNota);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.printf("Média da turma: %.2f\n", media);

        input.close();
    }
}
