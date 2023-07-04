public class Circle extends Ellipse{
    public Circle(double x) {
        super(x, x);
    }
    @Override
    public String getName() {
        return "Circle";
    }
}
