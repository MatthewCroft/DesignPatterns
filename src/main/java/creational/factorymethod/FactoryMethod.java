package creational.factorymethod;

interface Car {
    void drive();
}

class RaceCar implements Car {
    @Override
    public void drive() {
        System.out.println("This is a racecar");
    }
}

class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("This is a sedan");
    }
}

abstract class CarFactory {
    abstract Car createCar();
    public void drive() {
        Car car = createCar();
        car.drive();
    }
}

class SedanFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}

class RaceCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new RaceCar();
    }
}

class Application {
   public static void main(String... args) {
      CarFactory car = new SedanFactory();
      car.drive();
   }
}