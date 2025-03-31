class Shape {
    void display() {
        System.out.println("Shapes are from mathematics");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area = π*r*r");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle area = length*width");
    }
}

public class HI1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}
