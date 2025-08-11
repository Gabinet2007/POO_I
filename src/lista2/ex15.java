package lista2;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Preço de custo: R$ ");
        double preco = en.nextDouble();

        System.out.print("Código de origem (1 a 8): ");
        int codigo = en.nextInt();

        String origem = switch (codigo) {
            case 1 -> "Sul";
            case 2 -> "Norte";
            case 3 -> "Leste";
            case 4 -> "Oeste";
            case 5, 6 -> "Nordeste";
            case 7, 8 -> "Centro-oeste";
            default -> "Importado";
        };

        System.out.println("Preço: R$ " + preco);
        System.out.println("Procedência: " + origem);

        en.close();
    }
}
