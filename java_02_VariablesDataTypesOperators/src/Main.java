public class Main {

    public static void main(String[] args) {
        sum();
        compare();
        calculate();
    }

    /**
     * Создать переменные следующих типов: int, double, char с произвольными значениями.
     * Создать переменную result типа double, которая будет содержать сумму вышеуказанных переменных.
     * Вывести в консоль переменную result.
     */
    static void sum() {
        int number = 10_000;
        double money = 100_000.01;
        char symbol = '&';
        double result = (double) number + money + (double) symbol;
        System.out.println(result);
    }

    /**
     * Даны переменные a = 5 и b = 12.
     * Создать переменную логического типа check, которая будет содержать результат
     * сравнения переменных a и b.
     * Вывести в консоль переменную check.
     */
    static void compare() {
        int a = 5;
        int b = 12;
        boolean check = a > b && a != b;
        System.out.println(check);
    }

    /**
     * Дана переменная a = 6. Необходимо выполнить последовательность операций с переменной a.
     * Сначала прибавить к ней 6, затем вычесть 2, разделить на 5, умножить на 7.
     */
    static void calculate() {
        int a = 6;
        System.out.print(a + " ");
        System.out.print((a += 6) + " ");
        System.out.print((a -= 2) + " ");
        System.out.print((a /= 5) + " ");
        System.out.print((a *= 7) + " ");
    }
}

