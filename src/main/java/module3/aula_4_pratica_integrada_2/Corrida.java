package module3.aula_4_pratica_integrada_2;

import java.math.BigDecimal;
import java.util.List;

public class Corrida {
    private double distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private int quantidadeVeiculoPermitidos;
    private List<Veiculo> listaVeiculos;

    public void socorrerCarro(Carro carro) {
        SocorristaCarro socorristaCarro = new SocorristaCarro();
        socorristaCarro.socorrer(carro);
    }

    public void socorrerMoto(Moto moto) {
        SocorristaMoto socorristaMoto = new SocorristaMoto();
        socorristaMoto.socorrer(moto);
    }

    public Veiculo getVencedor() {
        Veiculo veiculoGanhador = new Veiculo();
        double ganhador = 0;
        for (Veiculo v : listaVeiculos) {
            double aux = v.getVelocidade() * v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100));
            if (aux < ganhador) {
                ganhador = aux;
                veiculoGanhador = v;
            }
        }

        return veiculoGanhador;
    }

    public void registrarCarro(double velocidade, double aceleracao, int anguloDeGiro, String placa) {
        if (listaVeiculos.size() <= quantidadeVeiculoPermitidos) {
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
            System.out.println("Veiculo registrado com sucesso!!");
        } else {
            System.out.println("Impossivel cadastrar o veiculo porque a lista está cheia!!");
        }
    }

    public void registrarMoto(double velocidade, double aceleracao, int anguloDeGiro, String placa) {
        if (listaVeiculos.size() <= quantidadeVeiculoPermitidos) {
            listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
            System.out.println("Veiculo registrado com sucesso!!");
        } else {
            System.out.println("Impossivel cadastrar o veiculo porque a lista está cheia!!");
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        listaVeiculos.removeIf(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa));
    }

    public Corrida(double distancia, BigDecimal premioEmDolares, String nome, int quantidadeVeiculoPermitidos, List<Veiculo> listaVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculoPermitidos = quantidadeVeiculoPermitidos;
        this.listaVeiculos = listaVeiculos;
    }

    public Corrida() {
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", quantidadeVeiculoPermitidos=" + quantidadeVeiculoPermitidos +
                ", listaVeiculos=" + listaVeiculos +
                '}';
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public BigDecimal getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(BigDecimal premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeVeiculoPermitidos() {
        return quantidadeVeiculoPermitidos;
    }

    public void setQuantidadeVeiculoPermitidos(int quantidadeVeiculoPermitidos) {
        this.quantidadeVeiculoPermitidos = quantidadeVeiculoPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
}
