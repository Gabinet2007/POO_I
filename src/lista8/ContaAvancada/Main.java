package lista8.ContaAvancada;

public class Main {
    public static void main(String[] args) {
        Pessoa cliente = new Pessoa("Gabriel Barni", "Rua Pedro Frankenberger, 435");
        Banco banco = new Banco(123, "Banco do Brasil", 50);

        // Conta Simples
        ContaSimples contaSimples = new ContaSimples(banco, 1234, 56789, cliente);
        contaSimples.deposito(1000);
        contaSimples.depositoPoupanca(500);

        // Conta Especial
        CartaoDeCredito cartao = new CartaoDeCredito(99999, "Visa", 3000.0, "Gold");
        ContaEspecial contaEspecial = new ContaEspecial(banco, 4321, 98765, cliente, 10, 5000.0, cartao);
        contaEspecial.deposito(2000);
        contaEspecial.saque(500);

        // Exibir tudo
        System.out.println(contaSimples);
        System.out.println("\n--------------------------\n");
        System.out.println(contaEspecial);
    }
}
