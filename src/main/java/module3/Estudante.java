package module3;

import java.time.LocalDate;

public class Estudante {
    String nome;
    LocalDate dataDeNascimento;
    int numeroDeMatricula;
    String serie;

    public Estudante(String nome, LocalDate dataDeNascimento, int numeroDeMatricula, String serie) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroDeMatricula = numeroDeMatricula;
        this.serie = serie;
    }

    public Estudante() {
    }

    public void setAll(String nome, LocalDate dataDeNascimento, int numeroDeMatricula, String serie) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroDeMatricula = numeroDeMatricula;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", numeroDeMatricula=" + numeroDeMatricula +
                ", serie='" + serie + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
