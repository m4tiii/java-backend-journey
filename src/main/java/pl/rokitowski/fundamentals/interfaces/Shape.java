package pl.rokitowski.fundamentals.interfaces;

public interface Shape {
    public double area();

    default String describe(){
        return "A " + getClass().getSimpleName() + " with area of " + area();
    }
}
