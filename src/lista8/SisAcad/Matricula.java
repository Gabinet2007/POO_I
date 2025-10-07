package lista8.SisAcad;

import java.util.ArrayList;
import java.util.List;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private List<RegistroFrequencia> registros;
    private String situacao;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.registros = new ArrayList<>();
        this.situacao = "Cursando";
    }

    public void adicionarRegistro(RegistroFrequencia r) {
        registros.add(r);
    }

    public double calcularFrequencia() {
        long presencas = registros.stream().filter(RegistroFrequencia::isPresente).count();
        return registros.isEmpty() ? 0 : (presencas * 100.0 / registros.size());
    }

    public void atualizarSituacao() {
        double freq = calcularFrequencia();
        if (freq < 75) {
            situacao = "Reprovado por falta";
        } else {
            situacao = "Aprovado";
        }
    }

    public String getSituacao() {
        return situacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}

