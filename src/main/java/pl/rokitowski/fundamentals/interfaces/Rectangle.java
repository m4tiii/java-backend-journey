package pl.rokitowski.fundamentals.interfaces;

public class Rectangle implements Shape{

    double a;
    double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }
}
