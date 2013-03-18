package br.com.renato.ControleDeTurmas;

import java.util.ArrayList;

public class Turma {
    //Variaveis de atributos da turma

    private int codigo;
    private String descricao;
    //Classe Alunos é uma variaveis com seus repectivos atributos
    private ArrayList<Aluno> alunos;

    //construtor de turmas 
    public Turma(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        alunos = new ArrayList<Aluno>();
    }

    //Geracao de getter e Setter da turma
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

    //Operacao Quantidade de Alunos
    public int quantidadeAlunos() {
        return alunos.size();
    }

    //Operacao Quantidade de Alunos Aprovados
    public int quantidadeAlunosAprovados() {
        int quantidade = 0;
        for (int x = 0; x < alunos.size(); x++) {
            //BUSCA O ALUNOS DETERMINADO NA POSICAO X
            Aluno aluno;
            aluno = alunos.get(x);
            //SE A MÉDIA DESSE ALUMOS FOR MAIOR QUE 6 ESTA APROVADO
            if (aluno.calcularMedia() > 6) {
                quantidade++;
            }
        }
        return quantidade;
    }

    //Operacao Quantidade de Alunos Reprovados
    public int quantidadeAlunosReprovados() {
        int quantidade = 0;
        for (int x = 0; x < alunos.size(); x++) {
            //BUSCA O ALUNOS DETERMINADO NA POSICAO X
            Aluno aluno;
            aluno = alunos.get(x);
            //SE A MÉDIA DESSE ALUMOS FOR MENOR QUE 6 ESTA REPROVADO
            if (aluno.calcularMedia() < 6) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
