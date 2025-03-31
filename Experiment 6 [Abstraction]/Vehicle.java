interface Vehicle {
    void drive();
}

interface ElectricVehicle {
    void chargeBattery();
}

class Tesla implements Vehicle, ElectricVehicle {
    public void drive() {
        System.out.println("Tesla is driving silently...");
    }

    public void chargeBattery() {
        System.out.println("Tesla battery is charging...");
    }

    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.drive();
        myTesla.chargeBattery();
    }
}
