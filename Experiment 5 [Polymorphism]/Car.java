class Car {
    String name;
    int modelYear;

    public Car(String name) {
        this.name = name;
        this.modelYear = 0;
    }

    public Car(String name, int modelYear) {
        this.name = name;
        this.modelYear = modelYear;
    }

    public void display() {
        System.out.println("Car Name: " + name);
        if (modelYear != 0)
            System.out.println("Model Year: " + modelYear);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", 2022);

        car1.display();
        System.out.println();
        car2.display();
    }
}
