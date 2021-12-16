package module3;

import java.util.List;

public class Turma {

    String serie;
    int codigo;
    List<Disciplina> disciplina;
    List<Estudante> estudante;

    public Turma(String serie, int codigo, List<Disciplina> disciplina, List<Estudante> estudante) {
        this.serie = serie;
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.estudante = estudante;
    }

    public Turma() {
    }

    public void setAll(String serie, int codigo, List<Disciplina> disciplina, List<Estudante> estudante) {
        this.serie = serie;
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                ", codigo=" + codigo +
                ", disciplina=" + disciplina +
                ", estudante=" + estudante +
                '}';
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public List<Estudante> getEstudante() {
        return estudante;
    }

    public void setEstudante(List<Estudante> estudante) {
        this.estudante = estudante;
    }
}
