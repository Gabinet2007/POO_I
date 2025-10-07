package lista8.HomeTheater;

public class HomeTheater {
    private SistemaDeSom som;
    private SistemaDeVideo video;

    public HomeTheater(SistemaDeSom som, SistemaDeVideo video) {
        this.som = som;
        this.video = video;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Home Theater ===\n")
                .append(som.toString()).append("\n")
                .append(video.toString());
        return sb.toString();
    }
}

