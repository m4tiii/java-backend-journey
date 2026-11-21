package pl.rokitowski.fundamentals.interfaces;

public record Trinagle(double base, double height) implements Shape {
    @Override
    public double area() {
        return base*height/2;
    }
}
