package lista8.HomeTheater;

public class Main {
    public static void main(String[] args) {
        SistemaDeSom som = new SistemaDeSom(110f, 200f, "Sony", "algum ai", 1200f);
        SistemaDeVideo video = new SistemaDeVideo(110f, 180f, "Samsung", "TV muito boa", "led", "4K");

        HomeTheater home = new HomeTheater(som, video);

        System.out.println(home);
    }
}
