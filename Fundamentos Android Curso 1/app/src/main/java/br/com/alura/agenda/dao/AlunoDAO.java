package br.com.alura.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.agenda.ui.model.Aluno;

public class AlunoDAO<alunos> {
    private final static List<Aluno> alunos = new ArrayList<>();
    
    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);}
}
