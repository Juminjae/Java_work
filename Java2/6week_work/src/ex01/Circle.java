package ex01;

public class Circle implements IGraphics{
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double perimeter() {
		return radius*2*Math.PI;
	}
	
	public void draw() {
		System.out.println("Circle Draw");
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
}