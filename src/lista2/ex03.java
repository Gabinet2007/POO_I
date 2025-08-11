package lista2;

import java.util.Objects;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Insira o seu gênero(F/M): ");
        String str = en.nextLine();
        System.out.println("Seu gênero: ");
        if (Objects.equals(str, "F")) {
            System.out.println("Feminino");
        } else if (Objects.equals(str, "M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Letra inválida");
        }
        en.close();
    }
}
