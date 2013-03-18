package br.com.renato.ControleDeTurmas;

import java.util.List;
import java.util.Scanner;

public class Instituicao {

    private List<Turma> turmas;

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    //Operacao matricula
    public void matriculas(Aluno aluno) {
        int ra,codigo ;
        String nome,descricao;
        
        //Receber os dados e gravar no alunos
        Scanner id = new Scanner(System.in);
        System.out.println("Digite o RA do aluno :");
        ra = id.nextInt();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno :");
        nome = sc.nextLine();
        
        Scanner idturma = new Scanner(System.in);
        System.out.println("Digite o Código da Turma  do aluno :");
        codigo = idturma.nextInt();
        
        Scanner nomeTurma = new Scanner(System.in);
        System.out.println("Digite o nome da Turma do aluno :");
        descricao = nomeTurma.nextLine();
        
        
        aluno.setRa(ra);
        aluno.setNome(nome);
        
        //preciso entender melhor
        Turma turma = new Turma(codigo,descricao);
        aluno.setTurma(turma);
        
        aluno.getTurma();
    }

    
    
}