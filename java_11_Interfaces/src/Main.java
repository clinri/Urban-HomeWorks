import classes.Bird;
import classes.Fish;
import classes.Human;

public class Main {
    public static void main(String[] args) {
        createObjects();
    }

    /**
     * Создать классы Human, Fish, Bird с полями имени, возраста (можно добавить любые поля по своему усмотрению).
     * Создать интерфейс Swimmable с методом, описывающим возможность плавать – swim.
     * Созданные выше классы должны наследоваться от этого интерфейса, реализация метода у каждого класса будет своя,
     * например, у человека – умеет плавать техникой брасс. Создать интерфейс Flyable с методом fly.
     * Наследовать от этого интерфейса те классы, которые могут в той или иной мере выполнять полет.
     * В классе с методом main создать экземпляры классов Human, Fish, Bird, вызвать у этих экземпляров имеющиеся методы
     */
    private static void createObjects() {
        Bird bird = new Bird("Утка", 2);
        Fish fish = new Fish("Карась", 3);
        Human human = new Human("Василий", 32);
        bird.fly();
        bird.swim();
        fish.swim();
        human.swim();
        human.fly();
    }
}