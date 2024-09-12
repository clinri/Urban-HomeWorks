package birds;

public class Eagle extends Bird {

    public Eagle(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Орел летит медленно взмахивая крыльями со скоростью " + flySpeed);
    }

    @Override
    public void makeSound() {
        System.out.println("Орел издает звук \"Ка-а-р\"");
    }
}
