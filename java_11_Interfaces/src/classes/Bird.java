package classes;

import interfaces.Flyable;
import interfaces.Swimmable;

public class Bird implements Swimmable, Flyable {
    String name;
    int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает болтая ножками");
    }

    @Override
    public void fly() {
        System.out.println(name + " летит взмахивая крыльями уже " + age + " лет");
    }
}
