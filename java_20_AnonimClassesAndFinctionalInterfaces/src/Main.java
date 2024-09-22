import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        print();
        concat();
    }

    /**
     * 1. Написать функциональный интерфейс Printable с методом print().
     * В классе с методом main создать несколько анонимных классов с различными реализациями метода print().
     */
    private static void print() {
        Printable simplePrint = new Printable() {
            @Override
            public void print(String string) {
                System.out.println(string);
            }
        };

        Printable modernPrint = new Printable() {
            @Override
            public void print(String string) {
                System.out.println("@=" + string + "=@");
            }
        };

        Printable binaryPrint = new Printable() {
            @Override
            public void print(String string) {
                System.out.println(Arrays.toString(string.getBytes()));
            }
        };
        String text = "Привет";
        simplePrint.print(text);
        modernPrint.print(text);
        binaryPrint.print(text);
    }

    /**
     * 2. Написать функциональный интерфейс Concationble с методом concat(),
     * который объединяет две строковых переменных, передаваемых в параметры метода и возвращает строку.
     * В классе с методом main создать несколько анонимных классов с различными реализациями метода concat().
     */
    private static void concat() {
        Concationble directConcat = new Concationble() {
            @Override
            public String concat(String first, String second) {
                return first + " " + second;
            }
        };

        Concationble reverseConcat = new Concationble() {
            @Override
            public String concat(String first, String second) {
                return second + " " + first;
            }
        };

        Concationble shuffleConcat = new Concationble() {
            @Override
            public String concat(String first, String second) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < first.length(); i++) {
                    result.append(first.charAt(i));
                    if (i < second.length()) result.append(second.charAt(i));
                }
                if (second.length() > first.length()) {
                    result.append(second.substring(first.length()));
                }
                return result.toString();
            }
        };
        String text1 = "Привет";
        String text2 = "Земляне";
        System.out.println(directConcat.concat(text1, text2));
        System.out.println(reverseConcat.concat(text1, text2));
        System.out.println(shuffleConcat.concat(text1, text2));
    }
}