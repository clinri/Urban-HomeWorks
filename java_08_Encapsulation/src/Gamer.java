/**
 * 1. Создать класс Gamer с полем private строкового типа nickname и полем private логического типа isActive,
 * оно характеризует в игре сейчас объект класса или нет, т.е. true или false соответственно.
 * Создать конструктор этого класса и методы доступа к полям класса.
 */

public class Gamer {
    private String nickname;
    private boolean isActive;

    public Gamer(String nickname, boolean isActive) {
        this.nickname = nickname;
        this.isActive = isActive;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "nickname='" + nickname + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
