public class Diamond extends Parallelogram{
    public Diamond(double a, double h) {
        super(a, a, h);
    }

    @Override
    public String getName() {
        return "Diamond";
    }
}
