package lista5;

public class ex10 {
    private int canal;
    private int volume;

    public ex10(int canalInicial, int volumeInicial) {
        if (canalInicial >= 1 && canalInicial <= 100) {
            this.canal = canalInicial;
        } else {
            this.canal = 1;
        }
        if (volumeInicial >= 0 && volumeInicial <= 50) {
            this.volume = volumeInicial;
        } else {
            this.volume = 10;
        }
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            this.canal = novoCanal;
        }
    }

    public void aumentarVolume() {
        if (volume < 50) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public String toString() {
        return "TV [Canal=" + canal + ", Volume=" + volume + "]";
    }
}
