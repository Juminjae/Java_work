package ex01;

abstract class Shape{
	private String name;
	abstract public double getArea();
	
	public Shape(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

class Triangle extends Shape{
	private double x, y;
	
	public Triangle(String name, double x, double y) {
		super(name);
		this.x=x;
		this.y=y;
	}
	@Override
	public double getArea() {
		return x*y/2.0;
	}
}

class Circle2 extends Shape{
	private double x, y;
	
	public Circle2(String name, double x, double y) {
		super(name);
		this.x=x;
		this.y=y;
	}
	@Override
	public double getArea() {
		return x*x*y;
	}
}

public class Width_info {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] objs = new Shape[2];
		objs[0] = new Circle2("Circle", 1, 3.14);
		objs[1] = new Triangle("Rectangle",1, 2);
		for(Shape obj:objs)
			System.out.println(obj.getName() + "| area= " + obj.getArea());
	}
}
