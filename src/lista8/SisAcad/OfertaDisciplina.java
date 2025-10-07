package lista8.SisAcad;

import java.util.ArrayList;
import java.util.List;

public class OfertaDisciplina {
    private int id;
    private String periodo;
    private Disciplina disciplina;
    private List<Professor> professores;

    public OfertaDisciplina(int id, String periodo, Disciplina disciplina) {
        this.id = id;
        this.periodo = periodo;
        this.disciplina = disciplina;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor p) {
        professores.add(p);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}
