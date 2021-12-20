package module3.aula_2_tt_exercice_2;

import java.util.ArrayList;
import java.util.List;

import static module3.aula_2_tt_exercice_2.Util.averageArea;

public class AverageAreasFigures {
    public static void main(String[] args) {

        Cicle cicle = new Cicle(5);
        Triangle triangle = new Triangle(5, 12);
        Rectangle rectangle = new Rectangle(6);

        List<Double> listOfAreas = new ArrayList<>();
        listOfAreas.add(cicle.calcularArea());
        listOfAreas.add(triangle.calcularArea());
        listOfAreas.add(rectangle.calcularArea());

        double average = averageArea(listOfAreas);
        System.out.println("Average area is: " + average);
    }
}
