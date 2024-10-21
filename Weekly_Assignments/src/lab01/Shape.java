package lab01;

// Abstract Shape class
abstract public class Shape {
    private int sides;

    public Shape(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    // Abstract method for area
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape [sides=" + sides + "]";
    }
}
