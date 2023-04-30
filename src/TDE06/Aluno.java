package TDE06;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nmAluno;
    private String nrRa;
    private List<Materia> materias = new ArrayList<>();

    public String getNmAluno() {
        return nmAluno;
    }

    public void setNmAluno(String nmAluno) {
        this.nmAluno = nmAluno;
    }

    public String getNrRa() {
        return nrRa;
    }

    public void setNrRa(String nrRa) {
        this.nrRa = nrRa;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nmAluno='" + nmAluno + '\'' +
                ", nrRa='" + nrRa + '\'' +
                ", materias=" + materias +
                '}';
    }
}
