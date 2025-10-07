package lista8.SisAcad;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String nome;
    private List<Professor> professores;

    public Disciplina(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor p) {
        professores.add(p);
    }

    public String getNome() {
        return nome;
    }
}
