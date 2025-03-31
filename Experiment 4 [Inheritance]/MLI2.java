class Animal {
    void eat() {
        System.out.println("Animals eat food");
    }
}

class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammals dont lay eggs");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class MLI2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.breathe();
        d.bark();
    }
}
