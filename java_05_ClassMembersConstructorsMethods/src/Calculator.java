/**
 * 1. Создать класс Calculator(Калькулятор) для выполнения основных арифметических операций.
 * Он содержит два поля: a и b.
 * 2. Написать методы вычисления суммы, разности, произведения и частного.
 * Методы суммы и разности принимают входные параметры a и b и возвращают результат соответствующих операций.
 * Методы произведения и частного необходимо написать с типом возвращаемого значения void (ничего не возвращают)
 * и результат этих операций внутри метода выводится в консоль методом System.out.println().
 */

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int difference(int a, int b) {
        return a - b;
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public void division(int a, int b) {
        if (b == 0) {
            System.out.println("На 0 делить нельзя");
        } else {
            System.out.println((double) a / b);
        }
    }
}
