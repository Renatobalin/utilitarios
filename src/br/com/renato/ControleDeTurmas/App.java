package br.com.renato.ControleDeTurmas;

import br.com.renato.utilitarios.io.Console;

public class App {
    
    public static void main(String[] args) {
        Instituicao instituicao = new Instituicao();
        String ra, nome, codigo, descricao;
        String notaG1, notaG2;
        String opcao = null;
        do {
            Console.escrever("Digite o RA do aluno :");
            ra = Console.ler();
            
            Console.escrever("Digite o nome do aluno :");
            nome = Console.ler();
            
            Console.escrever("Digite o Código da Turma  do aluno :");
            codigo = Console.ler();
            
            Console.escrever("Digite o nome da Turma do aluno :");
            descricao = Console.ler();
            
            Console.escrever("Digite a nota da g1 :");
            notaG1 = Console.ler();
            
            Console.escrever("Digite a nota da g2 :");
            notaG2 = Console.ler();
            
            Console.escrever("Deseja continuar:");
            opcao = Console.ler();
            
            if ("1".equals(opcao)) {
                
            } else {
                Console.escreverln("Opcao invalida!!!");
                
            }
        } while ("1".equals(opcao));
        
    }
}
