package exo4;

public class Rectangle {
	private float length;
	private float width;

	public Rectangle() {
		length = 1;
		width = 1;
	}
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length = length ;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width ;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return 2 * length + 2 * width;
	}

	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}	
}
	
	