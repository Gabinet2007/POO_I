package Socket;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = null;
        Socket conexao = null;
        BufferedReader entrada = null;
        try {
            servidor = new ServerSocket(8082);
            conexao = servidor.accept();
            entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            PrintStream saida = new PrintStream(conexao.getOutputStream());
            do {
                String texto = entrada.readLine();
                saida.println("Servidor: " + texto);
                if (texto == null) {
                    break;
                }
                System.out.println(texto);
            } while (!"sair".equals(entrada.toString()));

        } catch (IOException e) {
            System.out.println("Algo errado aconteceu");
        } finally {
            conexao.close();
            servidor.close();
        }
    }
}
