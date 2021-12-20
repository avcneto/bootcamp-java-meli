package module3.aula_2_tt_exercice_2;

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
