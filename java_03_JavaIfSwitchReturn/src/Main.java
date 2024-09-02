public class Main {

    public static void main(String[] args) {
        checkEvenOdd();
        showDecade();
    }

    /**
     * Даны два числа x и y.
     * Программа должна вывести в консоль «Удачное совпадение», – если оба числа четные,
     * либо оба числа нечетные.
     * Иначе программа ничего не выводит.
     */
    static void checkEvenOdd() {
        int x = 4;
        int y = 124;
        if ((x % 2 == 0 && y % 2 == 0) || ((x % 2 != 0 && y % 2 != 0))) {
            System.out.println("Удачное совпадение");
        }
    }

    /**
     * В переменной day лежит какое-то число из интервала от 1 до 31.
     * Определите в какую декаду месяца попадает это число (в первую, вторую или третью).
     */
    static void showDecade() {
        int day = 11;
        String decade = "";
        switch (day / 10) {
            case 1:
                decade = "первая декада";
                break;
            case 2:
                decade = "вторая декада";
                break;
            case 3:
                if (day <= 31) decade = "третья декада";
                break;
        }
        System.out.println(decade);
    }
}