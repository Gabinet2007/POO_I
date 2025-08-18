package lista3;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        int codigo, codMaior = 0, codMenor = 0, codMaisGordo = 0, codMaisMagro = 0;
        double altura, peso;
        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE, menorPeso = Double.MAX_VALUE;
        double somaAltura = 0, somaPeso = 0;
        int cont = 0;

        while (true) {
            System.out.print("Digite o código do cliente (0 para encerrar): ");
            codigo = en.nextInt();
            if (codigo == 0) {
                break;
            }
            System.out.print("Digite a altura (m): ");
            altura = en.nextDouble();
            System.out.print("Digite o peso (kg): ");
            peso = en.nextDouble();

            if (altura > maiorAltura) {
                maiorAltura = altura;
                codMaior = codigo;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                codMenor = codigo;
            }
            if (peso > maiorPeso) {
                maiorPeso = peso;
                codMaisGordo = codigo;
            }
            if (peso < menorPeso) {
                menorPeso = peso;
                codMaisMagro = codigo;
            }

            somaAltura += altura;
            somaPeso += peso;
            cont++;
        }

        if (cont > 0) {
            System.out.println("Cliente mais alto: Código " + codMaior + " - Altura " + maiorAltura);
            System.out.println("Cliente mais baixo: Código " + codMenor + " - Altura " + menorAltura);
            System.out.println("Cliente mais gordo: Código " + codMaisGordo + " - Peso " + maiorPeso);
            System.out.println("Cliente mais magro: Código " + codMaisMagro + " - Peso " + menorPeso);
            System.out.println("Média das alturas: " + (somaAltura / cont));
            System.out.println("Média dos pesos: " + (somaPeso / cont));
        } else {
            System.out.println("Nenhum cliente registrado.");
        }
        en.close();
    }
}
