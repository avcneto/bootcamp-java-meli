package module3.aula_2_tt_exercice_2;

public class Cicle extends GeometricFigure {
    private double lightning;

    public Cicle(double lightning) {
        this.lightning = lightning;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(lightning, 2);
        System.out.println("Circle area is: " + area);
        return area;
    }
}
