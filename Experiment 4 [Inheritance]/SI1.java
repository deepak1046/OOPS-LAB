class Parent {
    void show() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the Child class.");
    }
}

public class SI1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();
    }
}
