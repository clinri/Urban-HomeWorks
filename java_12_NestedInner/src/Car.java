public class Car implements Drivable {

    private String carBrand;
    private int speed;
    private int gear;
    private int weight;
    private Transmission transmission;
    private Wheels wheels;
    private Brakes brakes;
    private Engine engine;

    public Car(int weight, String carBrand) {
        this.weight = weight;
        this.speed = 0;
        this.gear = 0;
        this.carBrand = carBrand;
        this.engine = new Engine();
        this.transmission = new Transmission(5);
        this.wheels = new Wheels(20, 2);
        this.brakes = new Brakes(5);
    }

    @Override
    public void startUp() {
        engine.isRunning();
    }

    @Override
    public void startMove() {
        if (wheels.isReadyToSpin()) {
            wheels.convertEnergyFromMechanicalToMotion();
            System.out.println("Автомобиль начинает движение, скорость = " + speed);
        } else {
            System.out.println("Автомобиль не готов начать движение");
            return;
        }
        transmission.switchGearUp();
        transmission.switchGearUp();
        transmission.switchGearUp();
        transmission.switchGearUp();
        transmission.switchGearUp();
        transmission.switchGearUp();
        transmission.switchGearDown();
    }

    @Override
    public void stopMove() {
        Brakes brakes = new Brakes(5);
        if (brakes.readyToStop()) {
            brakes.convertEnergyFromMotionToFriction();
            System.out.println("Автомобиль " + carBrand + " останавливается");
            speed = 0;
        } else {
            System.out.println("Автомобиль " + carBrand + " не может остановиться");
        }
    }

    private class Engine {
        void isRunning() {
            System.out.println("Двигатель " + carBrand + " работает");
            class Piston {
                void convertEnergyBurningToMechanical() {
                    System.out.println("Энергии горения топлива преобразовывается в механическую энергию");
                }
            }
            class ExhaustSystem {
                void dampensLoudSound() {
                    System.out.println("Звук отводимых газов гасится в глушителе");
                }

                void emissionBurningProducts() {
                    System.out.println("Выхлопные газы выводятся в атмосферу");
                }
            }
            Piston piston = new Piston();
            ExhaustSystem exhaustSystem = new ExhaustSystem();
            piston.convertEnergyBurningToMechanical();
            exhaustSystem.dampensLoudSound();
            exhaustSystem.emissionBurningProducts();
        }
    }

    private class Transmission {
        int numberGears;

        public Transmission(int numberGears) {
            this.numberGears = numberGears;
        }

        void switchGearUp() {
            if (gear != numberGears) {
                gear++;
                speed += 10;
                System.out.println("Трансмиссия переключена на " + gear + " передачу, скорость = " + speed);
            } else {
                System.out.println("Уже установлена максимальная передача, скорость = " + speed);
            }
        }

        void switchGearDown() {
            if (gear != 0) {
                gear--;
                speed -= 10;
                System.out.println("Трансмиссия переключена на " + gear + " передачу, скорость = " + speed);
            } else {
                System.out.println("Уже установлена минимальная передача, скорость = " + speed);
            }
        }
    }

    private class Wheels {
        int diameter;
        int pressure;

        public Wheels(int diameter, int pressure) {
            this.diameter = diameter;
            this.pressure = pressure;
        }

        boolean isReadyToSpin() {
            return pressure >= 2;
        }

        void convertEnergyFromMechanicalToMotion() {
            System.out.println("Колеса приводят в движение автомобиль " + carBrand + " весом " + weight);
        }
    }

    private class Brakes {
        int thicknessPad;

        public Brakes(int thicknessPad) {
            this.thicknessPad = thicknessPad;
        }

        boolean readyToStop() {
            return thicknessPad > 1;
        }

        void convertEnergyFromMotionToFriction() {
            System.out.println("Тормоза преобразуют энергию движения в энергию трения");
        }
    }
}
