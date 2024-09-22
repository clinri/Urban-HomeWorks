import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        sumEvenNumbers();
        longestWord();
    }

    /**
     * 1. Напишите программу, реализующую лямбда-выражение для вычисления суммы всех четных элементов списка.
     */
    public static void sumEvenNumbers() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Calculation<Integer> calculationSumEvenNumbers = listInteger -> {
            int result = 0;
            for (Integer number : listInteger) {
                if (number % 2 == 0) result += number;
            }
            return result;
        };
        System.out.println(calculationSumEvenNumbers.calc(numbers));
    }

    /**
     * Напишите программу, реализующую лямбда-выражение для определения самого длинного слова в списке,
     * состоящего из нескольких слов.
     */
    public static void longestWord() {
        List<String> words = new ArrayList<>(Arrays.asList("ива", "собака", "уж", "аквалангист", "пингвин", "бесконечность"));
        Calculation<String> detectLongestWord = listString -> {
            String result = "";
            for (String word : words) {
                if (result.length() < word.length()) result = word;
            }
            return result;
        };
        System.out.println(detectLongestWord.calc(words));
    }
}