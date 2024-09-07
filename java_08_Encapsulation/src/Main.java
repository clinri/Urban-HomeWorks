public class Main {

    public static void main(String[] args) {
        createGamers();
    }

    /**
     * 2. Создать массив объектов класса Gamer и включить в него не менее пяти объектов класса Gamer
     * с разными nickname и isActive (например, двое будут в игре, т.е. true, двое - нет).
     * Вывести в консоль имена игроков, которые находятся в игре.
     */
    public static void createGamers() {
        Gamer[] gamers = {
                new Gamer("Nickolay", true),
                new Gamer("Philip", false),
                new Gamer("Aleksander", true),
                new Gamer("John", false),
                new Gamer("Vitaliy", true),
        };
        for (Gamer item : gamers) {
            if (item.isActive()) {
                System.out.println(item);
            }
        }
    }
}