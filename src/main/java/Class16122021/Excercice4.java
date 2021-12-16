package Class16122021;

import java.util.Scanner;

public class Excercice4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many numbers do you want to validate:");
        int number = reader.nextInt();
        reader.close();

        for (int i = 1; i <= number; i++) {
            System.out.println("number " + i + " is prime? " + isPrimer(i));
        }
    }

    public static boolean isPrimer(int number) {
        if (number == 1 || number == 0) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
