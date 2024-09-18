import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> regions = new HashMap<>();
        regions.put(48, "Липецк");
        regions.put(19, "Грязи");
        regions.put(22, "Орел");
        regions.put(29, "Ис");
        regions.put(67, "Яр");
        regions.put(98, "Уфа");
        regions.put(36, "Воронеж");
        regions.put(69, "Тамбов");
        System.out.println(getKeysMap(regions));
        System.out.println(getMapWithValueLengthMoreThenTree(regions));
    }

    /**
     * 1. Создайте HashMap c ключами Integer, значениями – String.
     * Напишите метод, который возвращает набор ключей, содержащихся в этой карте.
     */
    public static Set<Integer> getKeysMap(Map<Integer, String> map) {
        Set<Integer> result = new HashSet<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.add(entry.getKey());
        }
        return result;
    }

    /**
     * 2. Создайте HashMap c ключами Integer, значениями – String.
     * Напишите метод, который возвращает ассоциативный массив, состоящий из элементов исходного map,
     * при условии, что туда войдут элементы с длиной строки более 3.
     * Т.е. исходный map: [1="Red",2="Green",3="Black"].
     * Новый map: [2="Green",3="Black"].
     */
    public static Map<Integer, String> getMapWithValueLengthMoreThenTree(Map<Integer, String> map) {
        Map<Integer, String> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 3) result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}