package module3.aula_1_pratica_integrada_2;

import java.util.ArrayList;
import java.util.List;

public class Excercice3 {
    public static void main(String[] args) {
        Products products1 = new Products("Arroz", 10.99, 2);
        Products products2 = new Products("Feijão", 14.49, 1);
        Products products3 = new Products("Tomate", 9.99, 5);

        List<Products> listOfProducts = new ArrayList<>();
        listOfProducts.add(products1);
        listOfProducts.add(products2);
        listOfProducts.add(products3);

        listOfProducts.forEach(System.out::println);

        double valor = listOfProducts.stream()
                .map(Products::getTotal)
                .reduce(0.0, Double::sum);

        System.out.println("Total Value: " + valor);
    }
}
