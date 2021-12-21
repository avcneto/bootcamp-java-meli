package module3.aula_2_pratica_integrada_1_exercice_2;

public class Triangle extends GeometricFigure {
    private double base, altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double result = (base * altura) / 2;
        System.out.println("Triangle area: " + result);
        return result;
    }
}
