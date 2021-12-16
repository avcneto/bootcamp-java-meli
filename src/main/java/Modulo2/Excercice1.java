package Modulo2;

import java.util.Scanner;

public class Excercice1 {

    public static void main(String[] args) {
        int number;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = reader.nextInt();
        reader.close();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
