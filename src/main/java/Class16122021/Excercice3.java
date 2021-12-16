package Class16122021;

import java.util.Scanner;

public class Excercice3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("prime number:");
        int number = reader.nextInt();
        reader.close();

        System.out.println("Prime number: " + Excercice4.isPrimer(number));
    }
}
