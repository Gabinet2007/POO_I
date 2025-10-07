package lista8.SisAcad;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso(1, "Bacharelado Ciência da Computação");
        Fase fase = new Fase(1, 2);
        Disciplina disciplina = new Disciplina(1, "Programação Orientada a Objetos");
        Professor prof1 = new Professor(1, "Rodrigo Curvêllo");
        disciplina.adicionarProfessor(prof1);
        fase.adicionarDisciplina(disciplina);
        curso.adicionarFase(fase);
        Aluno aluno = new Aluno(1, "Gabriel Barni", curso);
        OfertaDisciplina oferta = new OfertaDisciplina(1, "2025/2", disciplina);
        oferta.adicionarProfessor(prof1);
        MatriculaDisciplina matricula = new MatriculaDisciplina(1, aluno, oferta);
        aluno.adicionarMatricula(matricula);
        Frequencia freq = new Frequencia(1, LocalDate.now(), true, prof1);
        matricula.registrarFrequencia(freq);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Professor: " + prof1.getNome());
        System.out.println("Presença registrada: " + freq.isPresente());
    }
}
