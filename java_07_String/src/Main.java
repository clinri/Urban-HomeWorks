import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        arrayChars();
        firstAndLast();
        getIndexZero();
    }

    /**
     * 1. Дан массив со строками: String[] stringArray = {"ab", "cd", "ef"}.
     * Получите массив символов этих строк: char[] charArray =  {'a', 'b', 'c', 'd', 'e', 'f'}.
     */
    static void arrayChars() {
        String[] stringArray = {"ab", "cd", "ef"};
        String stringConcat = "";
        for (String item : stringArray) {
            stringConcat += item;
        }
        char[] charArray = new char[stringConcat.length()];
        for (int i = 0; i < stringConcat.length(); i++) {
            charArray[i] = stringConcat.charAt(i);
        }
        System.out.println(Arrays.toString(charArray));
    }

    /**
     * 2. Дана строка: String stroke = "12345".
     * Выведите в консоль значение, которое можно,
     * взяв первый и последний символ этой строки в следующем виде. Т.е.  "15".
     */
    static void firstAndLast() {
        String stroke = "12345";
        System.out.println(stroke.substring(0, 1) + stroke.substring(stroke.length() - 1));
    }

    /**
     * 3. Дана некоторая строка - "1203405".
     * Найдите позицию первого нуля в строке.
     * Т.е. позиция первого нуля в этой строке равна 2.
     */
    static void getIndexZero() {
        String stroke = "1203405";
        System.out.println(stroke.indexOf('0'));
    }
}