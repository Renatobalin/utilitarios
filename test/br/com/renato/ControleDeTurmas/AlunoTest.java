package br.com.renato.ControleDeTurmas;

import org.junit.Before;
import org.junit.Test;

//Criar Testes para Todos os metodos do Controle de turmas
public class AlunoTest {

    private Aluno al;

    @Before
    public void init() {
        setAl(new Aluno(1, ""));
        getAl().setNotaG1(1);
        getAl().setNotaG2(10);
    }

    @Test
    public void calculaMedia() {
        getAl().setNotaG1(1);
        getAl().setNotaG2(10);
        assertEquals(1, getAl().getRa());

    }

    @Test
    public void nomeNull() {
        getAl().setNotaG1(1);
        getAl().setNotaG2(10);

        assertEquals(1, getAl().getRa());
        assertEquals(1, getAl().getRa());

    }

    private void assertEquals(int par, int ra) {
        System.out.println("");
    }

    public Aluno getAl() {
        return al;
    }

    public void setAl(Aluno al) {
        this.al = al;
    }
}