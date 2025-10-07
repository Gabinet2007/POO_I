package lista8.SisAcad;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private Curso curso;
    private List<MatriculaDisciplina> matriculas; // <- MatriculaDisciplina

    public Aluno(int id, String nome, Curso curso) {
        super(id, nome);
        this.curso = curso;
        this.matriculas = new ArrayList<>();
    }

    public void adicionarMatricula(MatriculaDisciplina m) { // <- parâmetro MatriculaDisciplina
        matriculas.add(m);
    }

    public List<MatriculaDisciplina> getMatriculas() {
        return matriculas;
    }

    public Curso getCurso() {
        return curso;
    }
}
