import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Informe o tamanho da área a ser pintada (m²): ");
        double area = en.nextDouble();

        double litros = area / 6;
        double latas = Math.ceil(litros / 18);
        double gal = Math.ceil(litros / 3.6);
        double latasval = latas * 80;
        double galval = gal * 25;

        System.out.println("Será necessário " + (int)latas + " latas de tinta");
        System.out.println("O valor das latas será: " + latasval + " reais");

        System.out.println("Será necessário " + (int)gal + " galões de tinta");
        System.out.println("O valor dos galões será: " + galval + " reais");

        en.close();
    }
}
