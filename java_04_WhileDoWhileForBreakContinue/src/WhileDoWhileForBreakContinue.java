public class WhileDoWhileForBreakContinue {

    public static void main(String[] args) {
        numbersMultiplesThree();
        sumAllNumbers();
    }

    /**
     * Вывести в консоль значения диапазона чисел от 1 до 50 кратные 3 с использованием цикла while.
     */
    static void numbersMultiplesThree() {
        int n = 0;
        while (n++ < 50) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
        }
    }

    /**
     * Напишите программу, которая находит сумму всех чисел от 1 до 100 с использованием цикла for.
     */
    static void sumAllNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}