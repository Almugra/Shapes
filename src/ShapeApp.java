public class ShapeApp {
    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(5.0, 3.0);
        Circle circle = new Circle(4.0);
        Rectangle rectangle = new Rectangle(6.0, 4.0);
        Square square = new Square(5.0);

       printClassHelper(ellipse.getExtent(), ellipse.getSize(), ellipse.getName());
       printClassHelper(circle.getExtent(), circle.getSize(), circle.getName());
       printClassHelper(rectangle.getExtent(), rectangle.getSize(), rectangle.getName());
       printClassHelper(square.getExtent(), square.getSize(), square.getName());
    }
    public static void printClassHelper(double extent, double size, String name) {
        System.out.println("Class: " + name);
        System.out.println("Extent: " + extent);
        System.out.println("Size: " + size + "\n");
    }
}

