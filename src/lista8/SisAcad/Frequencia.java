package lista8.SisAcad;

import java.time.LocalDate;

public class Frequencia {
    private int id;
    private LocalDate data;
    private boolean presente;
    private Professor professor;

    public Frequencia(int id, LocalDate data, boolean presente, Professor professor) {
        this.id = id;
        this.data = data;
        this.presente = presente;
        this.professor = professor;
    }

    public boolean isPresente() {
        return presente;
    }
}
