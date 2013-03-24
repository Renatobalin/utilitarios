package br.com.renato.ControleDeTurmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Instituicao {

    private List<Turma> turmas = new ArrayList<Turma>();

    public List<Turma> getTurmas() {
        return Collections.unmodifiableList(turmas);
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void addTurma(Turma turma) {
        boolean add = turmas.add(turma);
    }

    void matriculas(Instituicao a1) {
        turmas.getClass();
        setTurmas(turmas);
    }
}
