package lista8.SisAcad;

import java.time.LocalDate;

public class RegistroFrequencia {
    private Professor professor;
    private boolean presente;
    private LocalDate data;

    public RegistroFrequencia(Professor professor, boolean presente) {
        this.professor = professor;
        this.presente = presente;
        this.data = LocalDate.now();
    }

    public boolean isPresente() {
        return presente;
    }

    public Professor getProfessor() {
        return professor;
    }

    public LocalDate getData() {
        return data;
    }
}

