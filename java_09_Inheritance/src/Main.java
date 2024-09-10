public class Main {
    /**
     * 1. Создать класс Sportsman с полями строкового типа name, team, поле age – целое число,
     * все поля отмечены модификатором private. Создать конструктор класса и методы get для доступа к полям класса.
     * В классе есть метод, описывающий общее действие спортсмена.
     *
     * Создать классы наследники Footballer, HockeyPlayer, Skier. В каждом из них написать свой дополнительный
     * (относящийся к конкретному классу) метод, например, у класса Footballer может быть метод scoringGoals,
     * характеризующий результативную игру забиванием голов, у других классов методы будут свои.
     *
     * В классе с методом main создать экземпляры классов – наследников, по 2 на каждый класс.
     * Вывести информацию о каждом экземпляре класса и действие всех имеющихся методов.
     */

    public static void main(String[] args) {
        Sportsman[] sportsmen = createSportsmen();
        for (Sportsman item : sportsmen) {
            System.out.println("=============");
            System.out.println("Спортсмен " + item.getClass().getName());
            System.out.println("имя: " + item.getName());
            System.out.println("команда: " + item.getTeam());
            System.out.println("возраст: " + item.getAge());
            switch (item.getClass().getName()) {
                case "Footballer":
                    ((Footballer) item).scoringGoals();
                    break;
                case "HockeyPlayer":
                    ((HockeyPlayer) item).hitsBullets();
                    break;
                case "Skier":
                    ((Skier) item).winRace();
                    break;
            }
        }
    }

    private static Sportsman[] createSportsmen() {
        Footballer footballer1 = new Footballer("Петр", "Спартак", 30);
        Footballer footballer2 = new Footballer("Константин", "Зенит", 28);
        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Игорь", "Динамо", 24);
        HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Евгений", "Динамо", 24);
        Skier skier1 = new Skier("Тимур", "Снеговики", 19);
        Skier skier2 = new Skier("Роман", "Пингвины", 18);

        Sportsman[] sportsmen = {
                footballer1,
                footballer2,
                hockeyPlayer1,
                hockeyPlayer2,
                skier1,
                skier2,
        };
        return sportsmen;
    }
}