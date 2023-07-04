public abstract class Shape {
    private final double extent;
    private final double size;

    public Shape(double extent, double size) {
        this.extent = extent;
        this.size = size;
    }

    public double getExtent() {
        return this.extent;
    }
    public double getSize() {
        return this.size;
    }
    public abstract String getName();

}

