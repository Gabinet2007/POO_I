package lista3;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        double divida = input.nextDouble();

        int[] parcelas = {1, 3, 6, 9, 12};
        int[] juros = {0, 10, 15, 20, 25};

        System.out.println("Quantidade de parcelas | % Juros | Valor da Dívida | Valor da Parcela");

        for (int i = 0; i < parcelas.length; i++) {
            double valorComJuros = divida + (divida * juros[i] / 100.0);
            double valorParcela = valorComJuros / parcelas[i];

            System.out.println(parcelas[i] + " | " + juros[i] + "% | " + valorComJuros + " | " + valorParcela);
        }

        input.close();
    }
}
