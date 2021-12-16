package Modulo2;

import java.util.Scanner;

public class Excercice5 {
    public static void main(String[] args) {
        int quantity;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        quantity = reader.nextInt();

        System.out.print("Enter the digit quantity: ");
        int digitNumber = reader.nextInt();

        System.out.print("digit: ");
        int digit = reader.nextInt();
        reader.close();

        int curr = 0;

        for (int i = 0; i < quantity; ) {

            int aux = Integer.toString(curr).length() - Integer.toString(curr).replaceAll(Integer.toString(digit), "").length();

            if (aux == digitNumber) {
                System.out.println(curr);
                i++;
            }
            curr++;
        }
    }
}
