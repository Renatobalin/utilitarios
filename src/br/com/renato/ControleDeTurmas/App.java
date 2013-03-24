package br.com.renato.ControleDeTurmas;

import br.com.renato.utilitarios.io.Console;

public class App {

    public static void main(String[] args) {
        Instituicao a1 = new Instituicao();
        a1.getTurmas();
        String ra, nome, codigo, nomeTurma;
        String opcao;
        do {
            Console.escrever("Digite o RA do aluno :");
            ra = Console.ler();

            Console.escrever("Digite o nome do aluno :");
            nome = Console.ler();

            Console.escrever("Digite o Código da Turma  do aluno :");
            codigo = Console.ler();

            Console.escrever("Digite o nome da Turma do aluno :");
            nomeTurma = Console.ler();

            Console.escrever("Deseja continuar:");
            opcao = Console.ler();

        } while ("1".equals(opcao));

        if ("1".equals(opcao)) {
        } else {
            Console.escreverln("opcao invalida:");
        }
    }
}