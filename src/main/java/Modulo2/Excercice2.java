package Modulo2;

import java.util.Scanner;

public class Excercice2 {
    public static void main(String[] args) {
        int number;
        int numberMultiple;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter with the number we would like to know if and multiple:");
        numberMultiple = reader.nextInt();

        System.out.print("How much number do you want: ");
        number = reader.nextInt();
        reader.close();

        for (int i = 1; i <= number; i++) {
            if (i % numberMultiple == 0) {
                System.out.println("Multiple: " + i);

            }
        }
    }
}
