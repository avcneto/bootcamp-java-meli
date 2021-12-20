package module3.aula_1_pratica_integrada_2;

import java.util.Arrays;
import java.util.Collections;

public class Excercice1 {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        System.out.println("Original list");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nordered list from smallest to largest");
        Arrays.sort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nordered list from largest to smallest");
        Arrays.sort(array, Collections.reverseOrder());
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
