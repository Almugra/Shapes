public class Trapezoid extends Shape {
    public Trapezoid(double a, double b, double c, double d, double h) {
        super(a + b + c+ d, ((a + c)/2)* h);
    }

    @Override
    public String getName() {
        return "Trapezoid";
    }
}
