package module3.aula_4_pratica_integrada_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vesturario vesturario1 = new Vesturario("Lacoste", "Vingadores");
        Vesturario vesturario2 = new Vesturario("Adidas", "Home aranha");
        List<Vesturario> lista1 = Arrays.asList(vesturario1, vesturario2);

        Vesturario vesturario3 = new Vesturario("Polo", "Arvore");
        Vesturario vesturario4 = new Vesturario("Nike", "Palmeiras");
        List<Vesturario> lista2 = Arrays.asList(vesturario3, vesturario4);

        Vesturario vesturario5 = new Vesturario("Puma", "Carro");
        Vesturario vesturario6 = new Vesturario("Asics", "Corrida");
        List<Vesturario> lista3 = Arrays.asList(vesturario5, vesturario6);

        System.out.println();

        int id1 = GuardaRoupa.guardarVestuarios(lista1);
        System.out.println("Roupa guardada no id: " + id1);

        int id2 = GuardaRoupa.guardarVestuarios(lista2);
        System.out.println("Roupa guardada no id: " + id2);

        int id3 = GuardaRoupa.guardarVestuarios(lista3);
        System.out.println("Roupa guardada no id: " + id3);

        System.out.println();

        GuardaRoupa.mostrarVestuarios();

        System.out.println();

        List<Vesturario> v = GuardaRoupa.devolverVestuarios(1);
        v.forEach(System.out::print);
    }
}
