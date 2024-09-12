package instruments;

public class Piano extends Instrument {

    @Override
    public void play() {
        System.out.println("Пианино играет");
    }

    @Override
    public void tune() {
        System.out.println("Настройка пианино");
    }
}
