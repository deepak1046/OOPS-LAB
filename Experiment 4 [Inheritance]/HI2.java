class Animal {
    void sound() {
        System.out.println("Every animal has different sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HI2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();  
        d.bark();   

        c.sound();  
        c.meow();   
    }
}
