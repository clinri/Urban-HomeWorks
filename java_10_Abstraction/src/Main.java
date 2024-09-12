import birds.Eagle;
import birds.Hawk;
import instruments.Guitar;
import instruments.Piano;

public class Main {

    public static void main(String[] args) {
        createInstruments();
        createBirds();
    }

    /**
     * 1. Напишите программу для создания абстрактного класса instruments.Instrument с абстрактными методами play() и tune().
     * Создайте подклассы для instruments.Guitar и instruments.Piano, которые расширяют класс instruments.Instrument
     * и реализуют соответствующие методы для игры и настройки каждого инструмента.
     */
    static void createInstruments() {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        guitar.play();
        guitar.tune();
        piano.play();
        piano.tune();
    }

    /**
     * 2. Напишите программу для создания абстрактного класса Bird с абстрактными методами fly() и makeSound().
     * У класса Bird имеется поле, характеризующее скорость полета flySpeed. У класса Bird есть конструктор.
     * Создайте подклассы Eagle и Hawk, расширяющие класс Bird, и реализуйте соответствующие методы для описания того,
     * как каждая птица летает и издает звуки.
     */
    static void createBirds() {
        Eagle eagle = new Eagle(60);
        Hawk hawk = new Hawk(45);
        eagle.fly();
        eagle.makeSound();
        hawk.fly();
        hawk.makeSound();
    }
}