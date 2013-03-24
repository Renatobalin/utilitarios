package br.com.renato.ControleDeTurmas;

import java.util.ArrayList;

public class Turma {

    private int codigo;
    private String descricao;
    private ArrayList<Aluno> alunos;

    public Turma(int codigo, String descricao, ArrayList<Aluno> alunos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.alunos = alunos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int quantidadeAlunos() {
        return alunos.size();
    }

    public void matriculas(Aluno al) {
        alunos.add(al);
        al.setTurma(this);
    }

    public void cancelarMatricula(Aluno al) {
        alunos.get(codigo);
        alunos.remove(al);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public int quantidadeAlunosAprovados() {
        int quantidade = 0;
        for (int x = 0; x < alunos.size(); x++) {
            Aluno aluno;
            aluno = alunos.get(x);
            if (aluno.calcularMedia() > 6) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int quantidadeAlunosReprovados() {
        int quantidade = 0;
        for (int x = 0; x < alunos.size(); x++) {
            Aluno aluno;
            aluno = alunos.get(x);
            if (aluno.calcularMedia() < 6) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
