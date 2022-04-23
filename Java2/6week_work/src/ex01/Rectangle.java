package ex01;

public class Rectangle implements IGraphics{
	private double length, width;
	
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	public double perimeter() {
		return (length+width)*2;
	}
}