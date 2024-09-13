package classes;

import interfaces.Flyable;
import interfaces.Swimmable;

public class Human implements Swimmable, Flyable {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " плывет техникой брасс");
    }

    @Override
    public void fly() {
        System.out.println(name + " летит на параплане");
    }
}
