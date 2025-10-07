package lista8.SisAcad;

import java.util.ArrayList;
import java.util.List;

public class Fase {
    private int id;
    private int numero;
    private List<Disciplina> disciplinas;

    public Fase(int id, int numero) {
        this.id = id;
        this.numero = numero;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }
}
