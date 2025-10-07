package lista8.Computador;

public class Main {
    public static void main(String[] args) {
        Processador cpu = new Processador("Intel", "processador", 3.6f, 25f);
        Memoria ram = new Memoria("Corsair", "memoria", 16f, 3200f);
        HD hd = new HD("Seagate", "hd", 2.0f, 7200);
        PlacaMae mobo = new PlacaMae("Asus", "placa mae", cpu, hd, ram);
        Gabinete gabinete = new Gabinete("Cooler Master", "aquario", 4, mobo);
        Teclado teclado = new Teclado("Logitech", "magnético");
        Mouse mouse = new Mouse("Razer", "optico");
        Monitor monitor = new Monitor("aoc", "ips", "1920x1080");

        Computador pc = new Computador(110f, 500f, "Dell", "pc", gabinete, teclado, mouse, monitor);

        System.out.println(pc);
    }
}

