import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        boolean resultCompareInt = compareArrays(intArray1, intArray2);
        printResult(intArray1, resultCompareInt);

        Double[] doubleArray1 = {1.3, 2.6, 3.8, 4.3, 5.6};
        Double[] doubleArray2 = {1.3, 2.6, 3.8, 4.3, 5.6};
        boolean resultCompareDouble = compareArrays(doubleArray1, doubleArray2);
        printResult(doubleArray1, resultCompareDouble);

        String[] stringArray1 = {"a", "b", "c"};
        String[] stringArray2 = {"a", "b", "c"};
        boolean resultCompareString = compareArrays(stringArray1, stringArray2);
        printResult(stringArray1, resultCompareString);

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(changeElementsByIndex(array, 2, 5)));
    }

    /**
     * 1. Напишите метод, который принимает два массива одного типа и проверяет,
     * содержат ли они одинаковые элементы в одном и том же порядке.
     */

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false; // Если длины массивов разные, они не равны
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) return false;
        }
        return true;
    }

    private static <T> void printResult(T[] array, boolean resultCompareInt) {
        System.out.println("Массивы типа " + array[0].getClass().getName() + " " +
                (resultCompareInt ? "одинаковые" : "не одинаковые"));
    }

    /**
     * 2. Напишите универсальный метод, чтобы обмениваться позициями двух различных элементов в массиве.
     */
    private static <T> T[] changeElementsByIndex(T[] array, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Индексы должны быть в пределах массива.");
        }
        T tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
        return array;
    }
}