package pl.rokitowski.fundamentals.interfaces;

public record Circle(double radius) implements Shape{

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }
}
