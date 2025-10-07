package lista8.CMP;

public class Main {
    public static void main(String[] args) {
        Pessoa dono = new Pessoa("Gabriel Barni", "Rua Pedro Frankenberger, 435");
        Motor motor = new Motor("Hyundai", 150.0f, 4, "Gasolina");
        Carro carro = new Carro("Hyundai", "Creta", "Prata", 2022, dono, motor);

        System.out.println(carro);
    }
}

