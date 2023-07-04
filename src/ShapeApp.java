import java.util.Random;

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

       Shape randShape = createShape();
       System.out.println(randShape.toString());
    }
    public static void printClassHelper(double extent, double size, String name) {
        System.out.println("Class: " + name);
        System.out.println("Extent: " + extent);
        System.out.println("Size: " + size + "\n");
    }
    // Der Rückgabewert ist Shape, da alle Objekte
    // von Shape vererben und somit der Rückgabewert alle Klassen annehmen kann
    public static Shape createShape() {
        Random random = new Random();
        int random_number = random.nextInt(4);

        switch (random_number) {
            case 0:
                return new Circle(5);
            case 1:
                return new Rectangle(2, 3);
            case 2:
                return new Square(4);
            case 3:
                return new Ellipse(2, 5);
            default:
                return null;
        }
    }
}

