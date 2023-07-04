public class Ellipse extends Shape {
    public Ellipse(double x, double y) {
        super(Math.PI * (x + y), Math.PI * x * y);
    }

    @Override
    public String getName() {
        return "Ellipse";
    }
}