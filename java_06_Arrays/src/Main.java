import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**
         * 1. Дан массив целых чисел int[] array = {3, 87, 12, 98, 2, 4, 66}.
         * Вывести в консоль элементы массива в обратном порядке, т.е. начиная с 66.
         */
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        System.out.println(Arrays.toString(reverse(array)));

        /**
         * 2. Дан произвольный массив чисел с плавающей точкой. Необходимо отсортировать его по убыванию.
         */
        double[] arrayDouble = {3.4, 1.3, 3.8, 9.5, 5.2};
        System.out.println(Arrays.toString(sortDescending(arrayDouble)));

        /**
         * 3. Дан массив целых чисел int[] array = {6, 117, 44, 5, 32, 81, 9}.
         * Необходимо вывести в консоль четные элементы массива.
         */
        array = new int[]{6, 117, 44, 5, 32, 81, 9};
        System.out.println(Arrays.toString(getEvenElements(array)));
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }


    public static double[] sortDescending(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] getEvenElements(int[] array) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int[] arrayNewSize = new int[result.length + 1];
                for (int j = 0; j < result.length; j++) {
                    arrayNewSize[j] = result[j];
                }
                arrayNewSize[arrayNewSize.length - 1] = array[i];
                result = arrayNewSize;
            }
        }
        return result;
    }
}