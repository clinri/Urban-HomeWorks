import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        System.out.println(contains(colors, "red"));
        System.out.println(contains(colors, "brown"));

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Integer> changedNumbers = changeFirstAndLast(numbers);
        System.out.println(changedNumbers);
    }

    /**
     * 1. Создайте ArrayList, содержащий разные цвета, тип элемента этого динамического массива – String.
     * Напишите метод для поиска элемента в списке , содержащем эти цвета.
     * На вход метод принимает параметр поиска. Например, если список содержит «red», «blue», «green»
     * и в аргументы метода передать «red», то метод должен вернуть true, символизируя то,
     * что этот цвет содержится в списке.
     */
    public static boolean contains(List<String> colors, String color) {
        for (String s : colors) {
            if (s.equals(color)) return true;
        }
        return false;
    }

    /**
     * 2. Создайте LinkedList, содержащий целые числа, т.е. Integer. Напишите метод,
     * который меняет местами первый и последний элементы этого списка и возвращает этот список
     * в новом виде. Т.е., если создали список [1, 2, 3, 4, 5], то в результате должны получить [5, 2, 3, 4, 1].
     */
    public static List<Integer> changeFirstAndLast(LinkedList<Integer> numbers) {
        Integer temp = numbers.getFirst();
        numbers.set(0, numbers.getLast());
        numbers.set(numbers.size() - 1, temp);
        return numbers;
    }
}