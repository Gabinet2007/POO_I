package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Scanner;


public class ClienteSocket {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        String texto = "";
        Socket cliente = null;

        PrintStream saida = null;
        BufferedReader dados = null;
        try {
            cliente = new Socket("172.16.2.207", 8082);
            String texto1 = String.valueOf(cliente.getInetAddress());
            texto1 = texto1.replaceAll("/", "");
            System.out.println(texto1);
            dados = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            saida = new PrintStream(cliente.getOutputStream());
            do {
                System.out.println("Digite algo para o servidor: ");
                texto = entrada.nextLine();
                LocalDateTime dt = LocalDateTime.now();
                saida.println(texto +" "+ dt);
                System.out.println(dados.readLine());
            } while (!"sair".equals(texto));
        } catch (IOException e) {
            System.out.println("Algo errado aconteceu");
        } finally {
            cliente.close();
        }
        entrada.close();
    }
}