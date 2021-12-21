package module3.aula_2_pratica_integrada_1_exercice_2;

import java.util.Scanner;

public class CalculeteRectangleArea {
    public static void main(String[] args) {
        //calculate rectangle area
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter with the side: ");
        double side = reader.nextDouble();
        reader.close();

        Rectangle rectangle = new Rectangle(side);
        rectangle.calcularArea();

    }

}
