package module3.aula_1_pratica_integrada_2;

import java.time.LocalDate;

public class Excercice2 {
    public static void main(String[] args) {
        double empresaX = 1.13;
        double percentageEmpresaX = 148.0 / 100.0;
        double percentageEmpresaY = 38.0 / 100.0;
        double empresaY = 18.4;
        int year = LocalDate.now().getYear();

        for (int i = year; i < year + 1000; i++) {
            empresaX += empresaX + (percentageEmpresaX * empresaX);
            empresaY += empresaY + (percentageEmpresaY * empresaY);

            System.out.println("Empresa X: " + i + " - " + empresaX);
            System.out.println("Empresa Y: " + i + " - " + empresaY);

            if (empresaX > empresaY) {
                System.out.println("In the year " + i + " the empresaX passed the empresaY");
                break;
            }
        }
    }
}
