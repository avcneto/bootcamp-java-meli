package module3.aula_4_pratica_integrada_2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro(250, 5, 90, "TEST1415");
        Carro carro2 = new Carro(310, 10, 90, "MELI1234");
        Moto moto = new Moto(220, 16.5, 180, "TTTT6522");

        List<Veiculo> veiculos = Arrays.asList(carro1, carro2, moto);

        Corrida corrida = new Corrida(100, new BigDecimal(15000), "Meli2021", 5, veiculos);

        Veiculo vencedor = corrida.getVencedor();
        System.out.println("Veiculo vencedor é: " + vencedor);

    }
}
