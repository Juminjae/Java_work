package ex01;
import java.util.Scanner;

class Car{
	private int speed;
	public Car() {}
	public Car(int speed) {
		this.speed=speed;
	}
	void write() {
		System.out.println("speed="+speed);
	}
}

public class CarTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("input : ");
		Car car = new Car(key.nextInt());
		car.write();
	}

}
