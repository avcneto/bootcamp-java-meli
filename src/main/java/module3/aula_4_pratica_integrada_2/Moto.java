package module3.aula_4_pratica_integrada_2;

public class Moto extends Veiculo {
    private static final Integer MOTO_RODAS = 2;
    private static final double MOTO_PESO = 300;

    public Moto(double velocidade, double aceleracao, int anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, MOTO_PESO, MOTO_RODAS);
    }

    public Moto() {
    }
}
