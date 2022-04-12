package ex02;

public class Circle extends shapes {
	static final double PI = 3.14;
	double r;
	
	public Circle(double r) {
		this.r=r;
	}
	
	double area() {
		return r*r*PI;
	}
	
	void write() {
		System.out.print("Circle [radius= " + r);
		System.out.printf("\tarea= %.2f]\n", area());
	}
}
