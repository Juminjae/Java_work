package ex01;
import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] circles = new Circle[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<circles.length; i++) {
			circles[i] = new Circle(scan.nextDouble());
		}
		for (int i = 0; i<circles.length; i++) {
			System.out.println("Area: "+ (double)(circles[i].getArea()));
		}
	}

}
