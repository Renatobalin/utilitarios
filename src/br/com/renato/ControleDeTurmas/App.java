package br.com.renato.ControleDeTurmas;

import br.com.renato.utilitarios.io.Console;

public class App {

    public static void main(String[] args) {
        Instituicao instituicao = new Instituicao();        
        String ra;
        String nome;
        String codigo;
        String descricao;
        
        Console.escrever("Digite o RA do aluno :");
        ra = Console.ler();

        Console.escrever("Digite o nome do aluno :");
        nome = Console.ler();

        Console.escrever("Digite o Código da Turma  do aluno :");
        codigo = Console.ler();

        Console.escrever("Digite o nome da Turma do aluno :");
        descricao = Console.ler();
        
        Console.escreverln(ra);
        

    }
}
