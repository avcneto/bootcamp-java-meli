package module3.aula_2_pratica_integrada_1_exercice_2;

import java.util.List;

public class Util {
    public static double averageArea(List<Double> areas) {
        return areas.stream().reduce(0.0, Double::sum) / areas.size();
    }
}
