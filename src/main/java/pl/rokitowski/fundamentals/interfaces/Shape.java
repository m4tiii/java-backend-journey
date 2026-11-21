package pl.rokitowski.fundamentals.interfaces;

sealed public interface Shape permits Circle, Rectangle, Trinagle{
    public double area();

    default String describe(){
        return "A " + getClass().getSimpleName() + " with area of " + area();
    }

    static String label(Shape s){
        return switch (s){
            case Circle c -> "Circle r=" + c.radius();
            case Rectangle r -> "Rectangle " + r.width() + "x" + r.height();
            case Trinagle t -> "Triangle";
        };
    }
}
