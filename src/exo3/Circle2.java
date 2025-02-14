package exo3;

public class Circle2 {
	private double radius ;
	
	public Circle2() {
		radius = 1.0;
	}
	
	public Circle2(double radius) {
		this.radius = radius ;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius ;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getCircumference() {
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return "Circle2 [radius=" + radius + "]";
	}
	
	
}
