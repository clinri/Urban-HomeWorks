package birds;

public class Hawk extends Bird {

    public Hawk(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Ястреб летит быстро взмахивая крыльями разгоняясь до " + flySpeed);
    }

    @Override
    public void makeSound() {
        System.out.println("Ястреб издает звук \"Ку-ка-ре-ку\"");
    }
}
