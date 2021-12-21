package module3.aula_2_pratica_integrada_1_exercice_2;

public class Rectangle extends GeometricFigure {
    private double side;

    public Rectangle(double side) {
        this.side = side;
    }

    @Override
    public double calcularArea() {
        double result = side * side;
        System.out.println("Rectangle area: " + result);
        return result;
    }
}
