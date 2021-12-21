package module3.aula_4_pratica_integrada_2;

public class Carro extends Veiculo {
    private static final Integer CARRO_RODAS = 4;
    private static final double CARRO_PESO = 1.000;

    public Carro(double velocidade, double aceleracao, int anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, CARRO_PESO, CARRO_RODAS);
    }

    public Carro() {
    }
}
