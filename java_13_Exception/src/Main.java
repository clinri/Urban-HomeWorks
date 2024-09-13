public class Main {

    public static void main(String[] args) throws Exception {
        requiredEvenNumber(4);
        requiredTextString("text");
    }

    /**
     * 1. Напишите метод, который принимает целое число в качестве параметра и выдает исключение,
     * если число нечетное. Необходимо протестировать ее в методе main с разными числами.
     */
    public static void requiredEvenNumber(int number) throws Exception {
        if (number % 2 != 0) throw new Exception("число не четное");
    }

    /**
     * 2. ***Напишите метод, который принимает строку в качестве входных данных
     * и выдает исключение, если строка содержит числа
     */
    public static void requiredTextString(String string) throws Exception {
        for (char item : string.toCharArray()) {
            if (Character.isDigit(item)) throw new Exception("строка содержит число");
        }
    }
}