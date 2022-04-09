package ex01;

public class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
		System.out.printf("radius = %.2f\n", radius);
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}

}
