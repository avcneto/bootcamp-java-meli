package module3.aula_4_pratica_integrada_2;

public class SocorristaMoto implements Socorrer<Moto> {

    @Override
    public void socorrer(Moto moto) {
        System.out.println("Socorrendo moto placa: " + moto.getPlaca());
    }
}
