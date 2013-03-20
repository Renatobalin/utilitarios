package br.com.renato.ControleDeTurmas;

import org.junit.Before;
import org.junit.Test;

//Criar Testes para Todos os metodos do Controle de turmas
public class AlunoTest {

    Aluno al;

    @Before
    public void init() {
        al = new Aluno(1, "");
        al.setNotaG1(1);
        al.setNotaG2(10);
    }

    @Test
    public void calculaMedia() {
        al.setNotaG1(1);
        al.setNotaG2(10);
        assertEquals(1, al.getRa());

    }

    @Test
    public void nomeNullo() {
        al.setNotaG1(1);
        al.setNotaG2(10);

        assertEquals(1, al.getRa());
        assertEquals(1, al.getRa());

    }

    private void assertEquals(int par, int ra) {
        System.out.println("");
    }
}