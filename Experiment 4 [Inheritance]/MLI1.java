class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car is moving at 80 km/h.");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car's maximum speed is 120 km/h.");
    }
}

public class MLI1 {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.run();
        eCar.speed();
        eCar.charge();
    }
}
