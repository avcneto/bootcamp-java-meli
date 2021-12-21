package module3.aula_4_pratica_integrada_1;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {

    private static final HashMap<Integer, List<Vesturario>> dicionario = new HashMap<>();
    static int contador = 0;

    public static int guardarVestuarios(List<Vesturario> listaDeVestuario) {
        dicionario.put(contador, listaDeVestuario);
        return contador++;
    }

    public static void mostrarVestuarios() {
        dicionario.forEach((integer, vesturarios) -> System.out.println(vesturarios));
    }

    public static List<Vesturario> devolverVestuarios(Integer id) {
        return dicionario.get(id);
    }

}
