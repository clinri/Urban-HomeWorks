package birds;

public abstract class Bird {

    int flySpeed;

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public abstract void fly();

    public abstract void makeSound();
}
