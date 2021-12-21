package module3.aula_2_pratica_integrada_1_exercice_2;

import java.util.Scanner;

public class CalculeteCicleArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter with the lightning: ");
        double lightning = reader.nextDouble();
        reader.close();

        Cicle cicle = new Cicle(lightning);
        cicle.calcularArea();
    }
}
