package module3.aula_2_pratica_integrada_1_exercice_2;

import java.util.Scanner;

public class CalculeteTriangleArea {
    public static void main(String[] args) {
        //calculate rectangle area
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter with the base: ");
        double side = reader.nextDouble();
        System.out.print("Enter with the height: ");
        double height = reader.nextDouble();
        reader.close();

        Triangle triangle = new Triangle(side, height);
        triangle.calcularArea();

    }
}
