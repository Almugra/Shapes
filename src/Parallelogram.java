public class Parallelogram extends Shape {
    public Parallelogram(double a, double b, double h) {
        super(2*a + 2*b, a * h);
    }
    @Override
    public String getName() {
        return "Parallelogram";
    }
}
