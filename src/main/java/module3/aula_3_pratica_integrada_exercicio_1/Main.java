package module3.aula_3_pratica_integrada_exercicio_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        People people1 = new People("Nathalia", "12345678911");
        People people2 = new People("Matheus", "987654321111");
        People people3 = new People("Gabriela", "87454124555");
        People people4 = new People("Ana paula", "87547845666");

        People[] people = {people1, people2, people3, people4};

        System.out.println("before ordination");
        Arrays.stream(people).forEach(System.out::println);

        SortUtil.sort(people);

        System.out.println("\n\nAfter ordination");
        Arrays.stream(people).forEach(System.out::println);

        CellPhone cellPhone1 = new CellPhone("11999887486", "Nathalia");
        CellPhone cellPhone2 = new CellPhone("13887744552", "Matheus");
        CellPhone cellPhone3 = new CellPhone("21887744551", "Gabriela");
        CellPhone cellPhone4 = new CellPhone("11998655487", "Ana paula");

        CellPhone[] cellPhone = {cellPhone1, cellPhone2, cellPhone3, cellPhone4};


        System.out.println("\n\nbefore ordination");
        Arrays.stream(cellPhone).forEach(System.out::println);

        SortUtil.sort(cellPhone);

        System.out.println("\n\nAfter ordination");
        Arrays.stream(cellPhone).forEach(System.out::println);

    }
}
