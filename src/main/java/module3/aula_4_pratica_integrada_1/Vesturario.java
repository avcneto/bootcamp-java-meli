package module3.aula_4_pratica_integrada_1;

public class Vesturario {
    private String marca;
    private String modelo;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Vesturario(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vesturario() {
    }

    @Override
    public String toString() {
        return "Vesturario{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
