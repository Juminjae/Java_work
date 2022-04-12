package ex02;

public class Rectangle extends shapes {
	private double d1, d2;
	
	public Rectangle(double d1, double d2) {
		this.d1=d1;
		this.d2=d2;
	}
	
	double area() {
		return d1*d2;
	}
	
	void write() {
		System.out.print("Rectangle [garo = " + d1 + "\tsero= " + d2);
		System.out.printf("\tarea= %.2f]\n", area());
	} 
}
