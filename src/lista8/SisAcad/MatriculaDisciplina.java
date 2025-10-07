package lista8.SisAcad;

import java.util.ArrayList;
import java.util.List;

public class MatriculaDisciplina {
    private int id;
    private Aluno aluno;
    private OfertaDisciplina oferta;
    private List<Frequencia> frequencias;

    public MatriculaDisciplina(int id, Aluno aluno, OfertaDisciplina oferta) {
        this.id = id;
        this.aluno = aluno;
        this.oferta = oferta;
        this.frequencias = new ArrayList<>();
    }

    public void registrarFrequencia(Frequencia f) {
        frequencias.add(f);
    }
}
