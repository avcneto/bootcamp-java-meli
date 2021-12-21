package module3.aula_4_pratica_integrada_2;

public class SocorristaCarro implements Socorrer<Carro> {

    @Override
    public void socorrer(Carro carro) {
        System.out.println("Socorrendo carro placa: " + carro.getPlaca());
    }
}
