public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(6, 3);
        System.out.println(calculator.sum(calculator.a, calculator.b));
        System.out.println(calculator.difference(calculator.a, calculator.b));
        calculator.multiply(calculator.a, calculator.b);
        calculator.division(calculator.a, calculator.b);
    }
}