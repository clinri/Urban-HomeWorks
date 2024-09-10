public class Skier extends Sportsman {

    public Skier(String name, String team, int age) {
        super(name, team, age);
    }

    public void winRace() {
        System.out.println("Лыжник побеждает в гонке");
    }
}
