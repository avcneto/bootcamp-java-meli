package module3.aula_3_pratica_integrada_exercicio_1;

public class People implements Precedente<People> {
    private String nome, cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public People(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public void setAll(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public int precedeA(People people) {
        return this.nome.compareTo(people.nome);
    }
}
