import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> colorCars = new HashSet<>();
        colorCars.add("purple");
        colorCars.add("red");
        colorCars.add("white");
        colorCars.add("black");
        colorCars.add("blue");
        colorCars.add("green");
        Set<String> colorsFlowers = new HashSet<>();
        colorsFlowers.add("yellow");
        colorsFlowers.add("blue");
        colorsFlowers.add("red");
        colorsFlowers.add("white");
        colorsFlowers.add("orange");
        System.out.println(commonElementsOfSets(colorCars, colorsFlowers));

        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        showNumbersMoreThanFifteenAndEvenOtherDivideOnTwo(numbers);
    }

    /**
     * 1. Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо.
     * Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
     */
    public static Set commonElementsOfSets(Set set1, Set set2) {
        Iterator<String> iterator = set1.iterator();
        Set<String> result = new HashSet<>();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (set2.contains(color)) result.add(color);
        }
        return result;
    }

    /**
     * 2. Создайте множество целых чисел. Необходимо вывести в консоль все его элементы,
     * которые больше 15 и являются четными. Остальные элементы набора тоже необходимо вывести в консоль,
     * но каждый из них разделив на 2
     */
    public static void showNumbersMoreThanFifteenAndEvenOtherDivideOnTwo(Set<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        Set<Integer> numbersMoreThanFifteenAndEven = new HashSet<>();
        Set<Integer> other = new HashSet<>();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 15 && number % 2 == 0) {
                numbersMoreThanFifteenAndEven.add(number);
            } else {
                other.add(number / 2);
            }
        }
        Iterator numbersMoreThanFifteenAndEvenIterator = numbersMoreThanFifteenAndEven.iterator();
        System.out.println("Числа больше 15 и являющиеся четными:");
        while (numbersMoreThanFifteenAndEvenIterator.hasNext()) {
            System.out.println(numbersMoreThanFifteenAndEvenIterator.next());
        }
        Iterator othersIterator = other.iterator();
        System.out.println("Остальные числа, разделенные на 2:");
        while (othersIterator.hasNext()) {
            System.out.println(othersIterator.next());
        }
    }
}