public class HockeyPlayer extends Sportsman {

    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }

    public void hitsBullets() {
        System.out.println("Хоккеист забивает буллиты");
    }
}
