package lab01;

// Ellipse class extending Rectangle
public class Ellipse extends Rectangle {
    private int semiMajorAxis;
    private int semiMinorAxis;

    public Ellipse(int semiMajorAxis, int semiMinorAxis) {
        super(0, 0); // Ellipses do not have sides, passing 0
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public int getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(int semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public int getSemiMinorAxis() {
        return semiMinorAxis;
    }

    public void setSemiMinorAxis(int semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis; // Formula for area of an ellipse
    }

    @Override
    public String toString() {
        return "Ellipse [semiMajorAxis=" + semiMajorAxis + ", semiMinorAxis=" + semiMinorAxis + 
               ", area=" + getArea() + "]";
    }
}

