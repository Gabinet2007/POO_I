package lista8.SisAcad;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String nome;
    private List<Fase> fases;

    public Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.fases = new ArrayList<>();
    }

    public void adicionarFase(Fase f) {
        fases.add(f);
    }

    public String getNome() {
        return nome;
    }
}

