package lab01;

public class Driver {

    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rectangle = new Rectangle(7, 3);
        System.out.println(rectangle.toString());

        // Test Circle
        Circle circle = new Circle(7);
        System.out.println(circle.toString());

        // Test Ellipse
        Ellipse ellipse = new Ellipse(4, 7);
        System.out.println(ellipse.toString());

    }
}
