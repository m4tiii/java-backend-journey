package pl.rokitowski.fundamentals.interfaces;

import java.util.List;

public class Main {
    static void main(String[] args) {
        Shape circle = new Circle(3.14);
        Shape rectangle = new Rectangle(3.21, 99.20);
        Shape triangle = new Trinagle(3.0, 5.0);

        IO.println(circle.area());
        IO.println(rectangle.area());


        List<Shape> shapes = List.of(new Circle(2), new Rectangle(3, 4), new Circle(1));
        double total = 0;
        for (Shape s: shapes){
            total += s.area();
        }
        IO.println(total);

        IO.println(circle.describe());
        IO.println(rectangle.describe());

        IO.println(Shape.label(circle));
        IO.println(Shape.label(rectangle));
        IO.println(Shape.label(triangle));
    }
}
