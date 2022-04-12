package ex02;

public abstract class shapes {
	
	abstract double area();
	abstract void write();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shapes cir = new Circle(10);
		cir.write();
		cir = new Rectangle(20,30);
		cir.write();
	}
}
