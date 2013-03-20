package br.com.renato.ControleDeTurmas;

import java.util.ArrayList;
import java.util.List;

public class Instituicao {
    
    private List<Turma> turmas = new ArrayList<Turma>();
    
    public List<Turma> getTurmas() {
        return turmas;
    }
    
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public void addTurma(Turma turma) {
        turmas.add(turma);
    }
}
