package ex01;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("W : ");
		rec.w = scan.nextInt();
		System.out.printf("H : ");
		rec.h = scan.nextInt();
		
		System.out.println("넓이는: "+rec.area());
		System.out.println("둘레는: "+rec.perimeter());	
	}

}
