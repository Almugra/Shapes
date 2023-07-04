public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super(2 * a + 2 * b, a * b);
    }
    @Override
    public String getName() {
        return "Rectangle";
    }
}
