import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        sumEvenNumbers();
        changeRegisters();
    }

    /**
     * 1. Дан массив целых чисел. Найти максимальное число из четных в этом массиве.
     */
    static void sumEvenNumbers() {
        Stream<Integer> streamNumbers = Stream.of(1, 2, 3, 4, 12, 5, 13, 6, 7, 8);
        Integer result = streamNumbers
                .filter(number -> number % 2 == 0)
                .max(Integer::compareTo).get();
        System.out.println(result);
    }

    /**
     * 2. Дана строка "Привет, Александр, с праздником, с Новым Годом".
     * Написать программу, которая поменяет регистр символов. Т.е. результат должен быть таким:
     * пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ
     */
    static void changeRegisters() {
        String s = "Привет, Александр, с праздником, с Новым Годом";
        char[] arraySymbols = s.toCharArray();
        for (int i = 0; i < arraySymbols.length; i++) {
            char item = arraySymbols[i];
            if (Character.isUpperCase(item)) {
                arraySymbols[i] = Character.toLowerCase(item);
            } else {
                arraySymbols[i] = Character.toUpperCase(item);
            }
        }
        System.out.println(String.valueOf(arraySymbols));
    }
}