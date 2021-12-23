package module3.aula_1_pratica_integrada_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RadixSort {
    private static final String VALUE = "0";

    public static String addLeadingZero(int num, String str) {
        int total = num == str.length() ? 0 : num - str.length();
        for (int i = 0; i < total; i++) {
            str = VALUE + str;
        }
        return str;
    }

    public static void addnewValue(int key, HashMap<String, ArrayList<String>> map, String value) {
        if (map.containsKey("L" + key)) {
            boolean addValue = map.get("L" + key).stream()
                    .noneMatch(it -> it.equalsIgnoreCase(value));
            if (addValue) {
                map.get("L" + key).add(value);
            }
        }
    }

    public static HashMap<String, ArrayList<String>> sortList(List<String> stringArrayByZero, int largest) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("L0", new ArrayList<>());
        map.put("L1", new ArrayList<>());
        map.put("L2", new ArrayList<>());
        map.put("L3", new ArrayList<>());
        map.put("L4", new ArrayList<>());
        map.put("L5", new ArrayList<>());
        map.put("L6", new ArrayList<>());
        map.put("L7", new ArrayList<>());
        map.put("L8", new ArrayList<>());
        map.put("L9", new ArrayList<>());

        for (int i = 1; i < largest + 1; i++) {
            for (String str : stringArrayByZero) {
                char lastNumber = str.charAt(str.length() - i);
                switch (lastNumber) {
                    case '0':
                        addnewValue(0, map, str);
                        break;
                    case '1':
                        addnewValue(1, map, str);
                        break;
                    case '2':
                        addnewValue(2, map, str);
                        break;
                    case '3':
                        addnewValue(3, map, str);
                        break;
                    case '4':
                        addnewValue(4, map, str);
                        break;
                    case '5':
                        addnewValue(5, map, str);
                        break;
                    case '6':
                        addnewValue(6, map, str);
                        break;
                    case '7':
                        addnewValue(7, map, str);
                        break;
                    case '8':
                        addnewValue(8, map, str);
                        break;
                    case '9':
                        addnewValue(9, map, str);
                        break;
                }
            }
        }
        map.forEach((k, v) -> v.sort(String::compareTo));

        return map;
    }


    public static void radxSort(int iArr[]) {
        List<String> stringArray = new ArrayList<>();
        List<String> stringArrayByZero = new ArrayList<>();
        int largest = 0;

        //converto int to String
        for (int num : iArr) {
            stringArray.add(Integer.toString(num));
        }

        //get max character
        for (String str : stringArray) {
            if (str.length() > largest) {
                largest = str.length();
            }
        }

        //add leadingZero
        for (String str : stringArray) {
            stringArrayByZero.add(addLeadingZero(largest, str));
        }

        HashMap<String, ArrayList<String>> result = sortList(stringArrayByZero, largest);
        result.forEach((k, v) -> System.out.println((k + ":" + v)));
    }

    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radxSort(iArr);
    }
}
