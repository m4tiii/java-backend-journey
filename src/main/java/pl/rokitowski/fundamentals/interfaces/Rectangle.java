package pl.rokitowski.fundamentals.interfaces;

public record Rectangle(double width, double height) implements Shape{
    @Override
    public double area() {
        return width*height;
    }
}
