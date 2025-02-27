package lab01;

public class Circle extends Shape {
	
	Circle(int radius) {
		super(0);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getSides()=" + getSides() + "]";
	}
	
	
}
