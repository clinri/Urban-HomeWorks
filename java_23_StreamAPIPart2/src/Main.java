import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        sumNumber();
        deleteAllRepeats();
    }

    /**
     * 1. Напишите программу для вычисления суммы всех четных и нечетных чисел в списке с использованием потоков.
     */
    static void sumNumber() {
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> sumResult = numbersStream.reduce(Integer::sum);
        System.out.println(sumResult.get());
    }

    /**
     * 2. Напишите программу для удаления всех повторяющихся элементов из списка с помощью потоков
     */
    static void deleteAllRepeats() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 2, 8, 5));
        List<Integer> result = numbers
                .stream()
                .collect(Collectors.groupingBy(n -> n))
                .keySet()
                .stream()
                .toList();
        System.out.println(result);
    }
}